package Weather_station_simulator.Abstract;

import java.util.ArrayList;
import java.util.Random;

public abstract class WeatherStation extends Thread {
    protected String name;
    protected Integer temperature;
    protected Random random = new Random();
    protected ArrayList<Observer> weatherObservers = new ArrayList<>();

    ArrayList<Observer> observers = new ArrayList<>();

    public WeatherStation(String name) {
        this.name = name;
        this.temperature = (int) (Math.round(random.nextDouble() * 30 * 10.0) / 10.0);
    }

    public void run() {
        while (true) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            temperature += random.nextInt(2) > 0 ? 1 : -1;
            notifyObservers();
        }
    }

    public abstract void add(Observer observer);
    public abstract void remove(Observer observer);
    public abstract void notifyObservers();
    public abstract Integer getTemperature();
}

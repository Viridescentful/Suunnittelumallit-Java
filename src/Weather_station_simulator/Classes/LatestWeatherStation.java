package Weather_station_simulator.Classes;

import Weather_station_simulator.Abstract.Observer;
import Weather_station_simulator.Abstract.WeatherStation;

public class LatestWeatherStation extends WeatherStation {
    public LatestWeatherStation(String name) {
        super(name);
    }

    public static final String RESET = "\u001B[0m";
    public static final String REMOVE = "\u001B[38;2;227;50;50m";

    @Override
    public void add(Observer observer) {
        weatherObservers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        if (weatherObservers.contains(observer)) {
            weatherObservers.remove(observer);

            System.out.println(REMOVE + observer.getName() + " removed." + RESET);
        } else {
            System.out.println("Observer not found.");
        }

        System.out.println();
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : weatherObservers) {
            observer.update(temperature);
        }
        System.out.println();
    }

    @Override
    public Integer getTemperature() {
        return temperature;
    }
}

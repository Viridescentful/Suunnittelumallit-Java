package Weatherstation_simulator.Classes;

import Weatherstation_simulator.Abstract.Observer;
import Weatherstation_simulator.Abstract.Weatherstation;

public class LatestWeatherstation extends Weatherstation {
    public LatestWeatherstation(String name) {
        super(name);
    }

    @Override
    public void add(Observer observer) {
        weatherObservers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        if (weatherObservers.contains(observer)) {
            weatherObservers.remove(observer);

            System.out.println(observer.getName() + " removed.");
        } else {
            System.out.println("Observer not found.");
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : weatherObservers) {
            observer.update(temperature);
        }
    }

    @Override
    public Integer getTemperature() {
        return temperature;
    }
}

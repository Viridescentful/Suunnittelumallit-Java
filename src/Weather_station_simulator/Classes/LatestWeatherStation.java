package Weather_station_simulator.Classes;

import Weather_station_simulator.Abstract.Observer;
import Weather_station_simulator.Abstract.WeatherStation;

public class LatestWeatherStation extends WeatherStation {
    public LatestWeatherStation(String name) {
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

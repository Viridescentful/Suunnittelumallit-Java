package Weather_station_simulator;

import Weather_station_simulator.Abstract.Observer;
import Weather_station_simulator.Abstract.WeatherStation;
import Weather_station_simulator.Classes.LatestObserver;
import Weather_station_simulator.Classes.LatestWeatherStation;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherstation = new LatestWeatherStation("Local Weatherstation");

        Observer observer1 = new LatestObserver("Observer 1");
        Observer observer2 = new LatestObserver("Observer 2");
        Observer observer3 = new LatestObserver("Observer 3");

        weatherstation.add(observer1);
        weatherstation.add(observer2);
        weatherstation.add(observer3);

        weatherstation.start();

        try {
            Thread.sleep(8950);

            weatherstation.remove(observer2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

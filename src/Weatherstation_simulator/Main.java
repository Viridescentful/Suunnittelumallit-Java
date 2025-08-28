package Weatherstation_simulator;

import Weatherstation_simulator.Abstract.Observer;
import Weatherstation_simulator.Abstract.Weatherstation;
import Weatherstation_simulator.Classes.LatestObserver;
import Weatherstation_simulator.Classes.LatestWeatherstation;

public class Main {
    public static void main(String[] args) {
        Weatherstation weatherstation = new LatestWeatherstation("Local Weatherstation");

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

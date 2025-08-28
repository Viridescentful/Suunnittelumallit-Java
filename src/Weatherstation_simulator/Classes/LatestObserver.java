package Weatherstation_simulator.Classes;

import Weatherstation_simulator.Abstract.Observer;

public class LatestObserver extends Observer {
    public LatestObserver(String name) {
        super(name);
    }

    @Override
    public void update(Integer temperature) {
        System.out.println(name + " received temperature update: " + temperature + "°C");
    }
}

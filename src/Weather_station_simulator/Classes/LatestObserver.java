package Weather_station_simulator.Classes;

import Weather_station_simulator.Abstract.Observer;

public class LatestObserver extends Observer {
    public LatestObserver(String name) {
        super(name);
    }

    public static final String RESET = "\u001B[0m";
    public static final String TEMP = "\u001B[38;2;245;231;103m";

    @Override
    public void update(Integer temperature) {
        System.out.println(TEMP + name + " received temperature update: " + temperature + "°C" + RESET);
    }
}

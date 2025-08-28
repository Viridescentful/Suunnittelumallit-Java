package Weatherstation_simulator.Abstract;

public abstract class Observer {
    protected String name;

    public Observer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void update(Integer temperature);
}

package Computer_Builder.Abstract;

import Computer_Builder.Classes.Computer;

public abstract class ComputerBuilder {
    public abstract void buildProcessor();
    public abstract void buildRAM();
    public abstract void buildHardDrive();
    public abstract void buildGraphicsCard();
    public abstract void buildOperatingSystem();
    public abstract Computer getComputer();
}

package Computer_Builder.Classes;

import Computer_Builder.Abstract.ComputerBuilder;

public class GamingComputerBuilder extends ComputerBuilder {
    private Computer computer;

    public GamingComputerBuilder() {
        this.computer = new Computer();
    }

    @Override
    public void buildProcessor() {
        computer.addComponent(new Component("Intel Core i9-13900K"));
    }

    @Override
    public void buildRAM() {
        computer.addComponent(new Component("64GB DDR5"));
    }

    @Override
    public void buildGraphicsCard() {
        computer.addComponent(new Component("NVIDIA GeForce RTX 4090"));
    }

    @Override
    public void buildOperatingSystem() {
        computer.addComponent(new Component("Windows 11 Pro"));
    }

    @Override
    public void buildHardDrive() {
        computer.addComponent(new Component("2TB NVMe SSD"));
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}

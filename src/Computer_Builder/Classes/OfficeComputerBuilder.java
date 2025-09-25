package Computer_Builder.Classes;

import Computer_Builder.Abstract.ComputerBuilder;

public class OfficeComputerBuilder extends ComputerBuilder {
    private Computer computer;

    public OfficeComputerBuilder() {
        this.computer = new Computer();
    }

    @Override
    public void buildProcessor() {
        computer.addComponent(new Component("Intel Core i5-12400"));
    }

    @Override
    public void buildRAM() {
        computer.addComponent(new Component("16GB DDR4"));
    }

    @Override
    public void buildGraphicsCard() {
        computer.addComponent(new Component("Integrated Graphics"));
    }

    @Override
    public void buildOperatingSystem() {
        computer.addComponent(new Component("Windows 11 Pro"));
    }

    @Override
    public void buildHardDrive() {
        computer.addComponent(new Component("512GB SSD"));
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}

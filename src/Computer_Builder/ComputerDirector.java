package Computer_Builder;

import Computer_Builder.Abstract.ComputerBuilder;

public class ComputerDirector {
    private ComputerBuilder builder;

    public ComputerDirector(ComputerBuilder builder) {
        this.builder = builder;
    }

    public void constructComputer() {
        builder.buildProcessor();
        builder.buildGraphicsCard();
        builder.buildRAM();
        builder.buildHardDrive();
        builder.buildOperatingSystem();
    }
}

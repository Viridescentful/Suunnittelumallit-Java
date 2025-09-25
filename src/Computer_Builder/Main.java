package Computer_Builder;

import Computer_Builder.Abstract.ComputerBuilder;
import Computer_Builder.Classes.Computer;
import Computer_Builder.Classes.GamingComputerBuilder;
import Computer_Builder.Classes.OfficeComputerBuilder;

public class Main {
    public static void main(String[] args) {
        ComputerBuilder builder = new OfficeComputerBuilder();
        ComputerDirector director = new ComputerDirector(builder);
        director.constructComputer();
        Computer computer = builder.getComputer();
        System.out.println("Computer built: \n" + computer);
    }
}

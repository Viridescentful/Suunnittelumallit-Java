package Customisable_Printer.Classes;

import Customisable_Printer.Abstract.Printer;

public class DecoratorPrinter extends Printer {
    private Printer printer;

    public DecoratorPrinter(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void print(String message) {
        printer.print(message);
    }
}

package Customisable_Printer.Classes;

import Customisable_Printer.Abstract.Printer;

public class BasicPrinter extends Printer {
    @Override
    public void print(String message) {
        System.out.println(message);
    }
}

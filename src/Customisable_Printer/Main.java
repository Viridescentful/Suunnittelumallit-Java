package Customisable_Printer;

import Customisable_Printer.Abstract.Printer;
import Customisable_Printer.Classes.BasicPrinter;
import Customisable_Printer.Classes.EncrypterPrinter;
import Customisable_Printer.Classes.XMLPrinter;

public class Main {
    public static void main(String[] args) {
        Printer printer = new EncrypterPrinter(new XMLPrinter(new BasicPrinter()));
        printer.print("Hello, World!");
    }
}

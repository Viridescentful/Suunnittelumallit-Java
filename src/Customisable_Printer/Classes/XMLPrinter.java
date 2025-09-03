package Customisable_Printer.Classes;

import Customisable_Printer.Abstract.Printer;

public class XMLPrinter extends DecoratorPrinter {
    private Printer printer;

    public XMLPrinter(Printer printer) {
        super(printer);
    }

    @Override
    public void print(String message) {
        super.print("<message>" + message + "</message>");
    }
}

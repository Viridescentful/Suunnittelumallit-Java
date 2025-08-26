package ASCII_Art_User_Interface;

import ASCII_Art_User_Interface.Abstract.UIFactory;
import ASCII_Art_User_Interface.Abstract.Button;
import ASCII_Art_User_Interface.Classes.Factories.FactoryA;

public class Main {
    public static void main(String[] args) {
        UIFactory factory = new FactoryA();

        Button newbutton = factory.createButton("Food");
        Button newbutton2 = factory.createButton("Alcohol");

        factory.Display();

        newbutton.setText("Drinks");

        factory.Display();
    }
}

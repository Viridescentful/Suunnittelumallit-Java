package ASCII_Art_User_Interface;

import ASCII_Art_User_Interface.Abstract.UIFactory;
import ASCII_Art_User_Interface.Abstract.Button;
import ASCII_Art_User_Interface.Abstract.Checkbox;
import ASCII_Art_User_Interface.Abstract.TextField;

import ASCII_Art_User_Interface.Classes.Factories.FactoryA;
import ASCII_Art_User_Interface.Classes.Factories.FactoryB;

public class Main {
    public static void main(String[] args) {
        UIFactory factory = new FactoryB();

        Button newbutton = factory.createButton("Food");
        Checkbox newcheckbox = factory.createCheckbox("Vegetarian");
        TextField newtextfield = factory.createTextField("Name");

        factory.Display();

        newbutton.setText("Drinks");

        factory.Display();
    }
}

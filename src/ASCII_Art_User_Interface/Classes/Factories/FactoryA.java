package ASCII_Art_User_Interface.Classes.Factories;

import ASCII_Art_User_Interface.Abstract.UIFactory;
import ASCII_Art_User_Interface.Abstract.Button;
import ASCII_Art_User_Interface.Abstract.TextField;
import ASCII_Art_User_Interface.Abstract.Checkbox;

import ASCII_Art_User_Interface.Classes.Buttons.ButtonA;
import ASCII_Art_User_Interface.Classes.TextFields.TextFieldA;
import ASCII_Art_User_Interface.Classes.Checkboxes.CheckboxA;

public class FactoryA extends UIFactory {

    @Override
    public Button createButton(String text) {
        Button button = new ButtonA(text);

        addComponent(button);
        return button;
    }

    @Override
    public TextField createTextField(String text) {
        TextField textField = new TextFieldA(text);

        addComponent(textField);
        return textField;
    }

    @Override
    public Checkbox createCheckbox(String text) {
        Checkbox checkbox = new CheckboxA(text);

        addComponent(checkbox);
        return checkbox;
    }
}

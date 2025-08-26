package ASCII_Art_User_Interface.Classes.Factories;

import ASCII_Art_User_Interface.Abstract.UIFactory;
import ASCII_Art_User_Interface.Abstract.Button;
import ASCII_Art_User_Interface.Abstract.TextField;
import ASCII_Art_User_Interface.Abstract.Checkbox;

import ASCII_Art_User_Interface.Classes.Buttons.ButtonB;
import ASCII_Art_User_Interface.Classes.TextFields.TextFieldB;
import ASCII_Art_User_Interface.Classes.Checkboxes.CheckboxB;

public class FactoryB extends UIFactory {

    @Override
    public Button createButton(String text) {
        Button button = new ButtonB(text);

        addComponent(button);
        return button;
    }

    @Override
    public TextField createTextField(String text) {
        TextField textField = new TextFieldB(text);

        addComponent(textField);
        return textField;
    }

    @Override
    public Checkbox createCheckbox(String text) {
        Checkbox checkbox = new CheckboxB(text);

        addComponent(checkbox);
        return checkbox;
    }
}

package ASCII_Art_User_Interface.Classes.Buttons;

import ASCII_Art_User_Interface.Abstract.Button;

public class ButtonA extends Button {
    String elementtext = "";

    public static String getWithBorder(String text) {
        int textLength = text.length();
        String border = "[#O" + "O".repeat(textLength) + "O#]";

        return border + "\n" + "[| " + text + " |]" + "\n" + border;
    }

    public ButtonA(String text) {
        elementtext = text;
    }

    @Override
    public String toString() {
        return getWithBorder(elementtext);
    }

    @Override
    public void setText(String text) {
        elementtext = text;
    }
}

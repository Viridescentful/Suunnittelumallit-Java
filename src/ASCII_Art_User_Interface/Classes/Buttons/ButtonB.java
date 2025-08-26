package ASCII_Art_User_Interface.Classes.Buttons;

import ASCII_Art_User_Interface.Abstract.Button;

public class ButtonB extends Button {
    String elementtext = "";

    public static String getWithBorder(String text) {
        int textLength = text.length();
        String border = "[+-" + "-".repeat(textLength) + "-+]";

        return border + "\n" + "[| " + text + " |]" + "\n" + border;
    }

    public ButtonB(String text) {
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

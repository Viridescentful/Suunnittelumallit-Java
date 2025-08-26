package ASCII_Art_User_Interface.Classes.TextFields;

import ASCII_Art_User_Interface.Abstract.TextField;

public class TextFieldA extends TextField {
    String elementtext = "";

    public static String getWithBorder(String text) {
        int textLength = text.length();
        String border = "{o_" + "_".repeat(textLength) + "_o}";

        return border + "\n" + "{| " + text + " |}" + "\n" + border;
    }

    public TextFieldA(String text) {
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

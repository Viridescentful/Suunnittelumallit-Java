package ASCII_Art_User_Interface.Classes.TextFields;

import ASCII_Art_User_Interface.Abstract.TextField;

public class TextFieldB extends TextField {
    String elementtext = "";

    public static String getWithBorder(String text) {
        int textLength = text.length();
        String border = "{S_" + "_".repeat(textLength) + "_S}";

        return border + "\n" + "[/ " + text + " /]" + "\n" + border;
    }

    public TextFieldB(String text) {
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

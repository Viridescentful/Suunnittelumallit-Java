package ASCII_Art_User_Interface.Classes.Checkboxes;

import ASCII_Art_User_Interface.Abstract.Checkbox;

public class CheckboxB extends Checkbox {
    String elementtext = "";

    public static String getWithBorder(String text) {
        int textLength = text.length();
        String border = "[#O" + "O".repeat(textLength) + "O#]";

        return border + "\n" + "[| " + text + " |]" + "\n" + border;
    }

    public CheckboxB(String text) {
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

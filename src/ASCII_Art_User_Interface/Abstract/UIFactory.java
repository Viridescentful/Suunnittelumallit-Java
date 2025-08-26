package ASCII_Art_User_Interface.Abstract;

import java.util.ArrayList;

public abstract class UIFactory {
    ArrayList<Object> components = new ArrayList<>();

    public void Display() {
        for (Object component : components) {
            System.out.println(component.toString());
            System.out.println();
        }
    }

    public void addComponent(Object component) {
        components.add(component);
    }

    public abstract Button createButton(String text);
    public abstract TextField createTextField(String text);
    public abstract Checkbox createCheckbox(String text);
}

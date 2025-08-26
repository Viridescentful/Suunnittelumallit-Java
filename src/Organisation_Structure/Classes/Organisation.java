package Organisation_Structure.Classes;

import Organisation_Structure.Abstact.OrganisationComponent;

import java.util.ArrayList;

public class Organisation extends OrganisationComponent {
    ArrayList<OrganisationComponent> components = new ArrayList<>();

    public Organisation(String name) {
        super(name);
    }

    @Override
    public void add(OrganisationComponent component) {
        if (component instanceof Employee || component instanceof Department) {
            components.add(component);
        } else {
            throw new UnsupportedOperationException("Only Departments and Employees can be added to an organisation.");
        }
    };

    @Override
    public void remove(OrganisationComponent component) {
        if ((component instanceof Employee || component instanceof Department) && components.contains(component)) {
            components.remove(component);
        } else {
            throw new UnsupportedOperationException("Component not found in organisation.");
        }
    };

    @Override
    public Object displayInfo() {
        StringBuilder info = new StringBuilder("<Organisation> \n" +
                " <name>" + name + "</name>\n");
        for (OrganisationComponent component : components) {
            info.append(component.displayInfo());
        }

        info.append("</Organisation>\n");

        return info.toString();
    }

    @Override
    public Integer getSalary() {
        Integer totalSalary = 0;

        for (OrganisationComponent component : components) {
            totalSalary += component.getSalary();
        }
        return totalSalary;
    }
}

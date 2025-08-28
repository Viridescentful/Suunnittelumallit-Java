package Organisation_Structure.Classes;

import Organisation_Structure.Abstact.OrganisationComponent;

import java.util.ArrayList;

public class Department extends OrganisationComponent {
    public static final String RESET = "\u001B[0m";
    public static final String COLOR = "\u001B[38;2;32;171;69m";



    ArrayList<Employee> employees = new ArrayList<>();

    public Department(String name) {
        super(name);
    }

    @Override
    public void add(OrganisationComponent component) {
        if (component instanceof Employee) {
            employees.add((Employee) component);
        } else {
            throw new UnsupportedOperationException("Only employees can be added to a department.");
        }
    };

    @Override
    public void remove(OrganisationComponent component) {
        if ((component instanceof Employee) && employees.contains(component)) {
            employees.remove(component);
        } else {
            throw new UnsupportedOperationException("Component not found in department.");
        }
    };

    @Override
    public Object displayInfo() {
        StringBuilder info = new StringBuilder(COLOR + " <Department> \n" +
                "  <name>" + name + "</name>\n" + RESET);
        for (OrganisationComponent component : employees) {
            info.append(component.displayInfo());
        }

        info.append(COLOR + " </Department>\n" + RESET);

        return info.toString();
    }

    @Override
    public Integer getSalary() {
        Integer totalSalary = 0;

        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        return totalSalary;
    }
}

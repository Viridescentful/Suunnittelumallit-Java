package Organisation_Structure.Classes;

import Organisation_Structure.Abstact.OrganisationComponent;

public class Employee extends OrganisationComponent {
    public static final String RESET = "\u001B[0m";
    public static final String COLOR = "\u001B[38;2;23;194;109m";

    protected Integer salary;

    public Employee(String name) {
        super(name);
        this.salary = 100;
    }

    @Override
    public void add(OrganisationComponent component) {
        throw new UnsupportedOperationException("Not supported in leaf.");
    };

    @Override
    public void remove(OrganisationComponent component) {
        throw new UnsupportedOperationException("Not supported in leaf.");
    };

    @Override
    public Object displayInfo() {
        StringBuilder info = new StringBuilder(COLOR + " <Employee> \n" +
                "  <name>" + name + "</name>\n");
        info.append("  <salary>" + salary + "</salary>\n");

        info.append(" </Employee>\n"+ RESET);

        return info.toString();
    }

    @Override
    public Integer getSalary() {
        return salary;
    }
}

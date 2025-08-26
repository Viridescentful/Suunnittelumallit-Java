package Organisation_Structure.Classes;

import Organisation_Structure.Abstact.OrganisationComponent;

public class Employee extends OrganisationComponent {
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
        StringBuilder info = new StringBuilder("    <Employee> \n" +
                "     <name>" + name + "</name>\n");
        info.append("     <salary>" + salary + "</salary>\n");

        info.append("    </Employee\n");

        return info.toString();
    }

    @Override
    public Integer getSalary() {
        return salary;
    }
}

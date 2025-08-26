package Organisation_Structure.Abstact;

public abstract class OrganisationComponent {
    protected String name;

    public OrganisationComponent(String name) {
        this.name = name;
    }

    public abstract void add(OrganisationComponent component);
    public abstract void remove(OrganisationComponent component);
    public abstract Object displayInfo();
    public abstract Integer getSalary();
}

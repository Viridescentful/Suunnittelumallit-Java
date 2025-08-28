package Organisation_Structure;

import Organisation_Structure.Classes.Organisation;
import Organisation_Structure.Classes.Department;
import Organisation_Structure.Classes.Employee;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.StringWriter;

public class Main {

    public static final String RESET = "\u001B[0m";
    public static final String SALARY = "\u001B[38;2;250;197;7m";

    public static void main(String[] args) {
        Organisation organisation = new Organisation("My Organisation");

        Employee emp1 = new Employee("Alice");
        Employee emp2 = new Employee("Bob");
        Employee emp3 = new Employee("Charlie");

        Department dept1 = new Department("HR");
        Department dept2 = new Department("Engineering");

        dept1.add(emp1);
        dept2.add(emp2);

        organisation.add(dept1);
        organisation.add(dept2);

        organisation.add(emp3);

        System.out.println(organisation.displayInfo());

        System.out.println(SALARY + "Total Salary: " + organisation.getSalary() + RESET);
    }
}

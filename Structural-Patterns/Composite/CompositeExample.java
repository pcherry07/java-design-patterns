import java.util.ArrayList;
import java.util.List;

// Component
interface Employee {
    void showDetails();
}

// Leaf
class Developer implements Employee {
    private String name;

    public Developer(String name) {
        this.name = name;
    }

    public void showDetails() {
        System.out.println("Developer: " + name);
    }
}

// Leaf
class Manager implements Employee {
    private String name;

    public Manager(String name) {
        this.name = name;
    }

    public void showDetails() {
        System.out.println("Manager: " + name);
    }
}

// Composite
class CompanyDirectory implements Employee {

    private List<Employee> employeeList = new ArrayList<>();

    public void addEmployee(Employee emp) {
        employeeList.add(emp);
    }

    public void showDetails() {
        for (Employee emp : employeeList) {
            emp.showDetails();
        }
    }
}

// Driver class
public class CompositeExample {

    public static void main(String[] args) {

        Developer dev1 = new Developer("Alice");
        Developer dev2 = new Developer("Bob");

        Manager manager1 = new Manager("John");

        CompanyDirectory directory = new CompanyDirectory();
        directory.addEmployee(dev1);
        directory.addEmployee(dev2);
        directory.addEmployee(manager1);

        directory.showDetails();
    }
}

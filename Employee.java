import java.util.*;

class Employee {
    private int id;
    private String name;
    private String designation;
    private double salary;

    public Employee(int id, String name, String designation, double salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class Employee1 {
    public static void main(String[] args) {
        LinkedList<Employee> employees = new LinkedList<>();

        // Adding employees to the linked list
        employees.add(new Employee(101, "kalyani", "Manager", 50000));
        employees.add(new Employee(102, "Ramu", "Engineer", 60000));
        employees.add(new Employee(103, "Chilakamma", "Developer", 45000));
employees.add(new Employee(104, "praveen", "Developer", 55000));

        // Sorting the employees based on name
        employees.sort(Comparator.comparing(Employee::getName));

        // Printing employees sorted by name
        System.out.println("Employees sorted by name:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        // Sorting the employees based on salary
        employees.sort(Comparator.comparingDouble(Employee::getSalary));

        // Printing employees sorted by salary
        System.out.println("\nEmployees sorted by salary:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
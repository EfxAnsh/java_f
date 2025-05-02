package experiment_9;

import java.util.ArrayList;

class Employee {
    String name;
    int id;
    double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String toString() {
        return "Name: " + name + ", ID: " + id + ", Salary: " + salary;
    }
}

public class EmployeeManager {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Aman", 101, 50000));
        employees.add(new Employee("Varchasv", 102, 60000));
        employees.add(new Employee("Sourabh", 103, 55000));

        // Update salary of ID 102
        for (Employee emp : employees) {
            if (emp.id == 102) {
                emp.salary = 65000;
            }
        }

        // Remove employee with ID 101
        employees.removeIf(emp -> emp.id == 101);

        // Print remaining employees
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}

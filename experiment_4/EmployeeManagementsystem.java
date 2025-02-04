package experiment_4;

class Employee {
    private int employeeID;
    private String name;
    private String department;
    private double salary;

    private static int totalEmployees = 0;

    public Employee() {
        this.employeeID = 0;
        this.name = "Default";
        this.department = "Not Assigned";
        this.salary = 0.0;
        totalEmployees++;
    }


    public Employee(int employeeID, String name, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.name = name;
        this.salary = salary;
        totalEmployees++;
    }

    
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public double calculateSalary() {
        return this.salary;
    }

    public void displayEmployeeInfo() {
        System.out.println("Employee ID: " + this.employeeID);
        System.out.println("Name: " + this.name);
        System.out.println("Department: " + this.department);
        System.out.println("Salary: $" + this.salary);
        System.out.println("-------------------------");
    }

    public static void displayTotalEmployees() {
        System.out.println("Total number of employees: " + totalEmployees);
    }
}

public class EmployeeManagementsystem {
    public static void main(String[] args) {
        Employee em1 = new Employee(101, "Ansh", "Cloud Engineer", 300000);
        Employee em2 = new Employee(102, "Satvik", "Cloud Engineer", 300000);
        Employee em3 = new Employee(); 

        em1.displayEmployeeInfo();
        em2.displayEmployeeInfo();
        em3.displayEmployeeInfo();

 
        Employee.displayTotalEmployees();

     
        System.out.println("Salary of " + em1.getName() + ": $" + em1.getSalary());
        System.out.println("Salary of " + em2.getName() + ": $" + em2.getSalary());
        System.out.println("Salary of Default Employee: $" + em3.getSalary());
    }
}

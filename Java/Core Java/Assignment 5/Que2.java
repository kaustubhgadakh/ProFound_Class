import java.util.Scanner;

class Employee {
    String name;
    int empId;

    // Default constructor
    public Employee() {
        this.name = "";
        this.empId = 0;
    }

    // Parameterized constructor
    public Employee(String name, int empId) {
        this.name = name;
        this.empId = empId;
    }

    // Method to be overridden by subclasses
    public double computeSalary() {
        return 0.0;
    }

    // toString() method to display employee details
    @Override
    public String toString() {
        return "Employee Name: " + name + "\nEmployee ID: " + empId;
    }
}

class WageEmployee extends Employee {
    int hrs;
    int rate;

    // Default constructor
    public WageEmployee() {
        super();
        this.hrs = 0;
        this.rate = 0;
    }

    // Parameterized constructor
    public WageEmployee(String name, int empId, int hrs, int rate) {
        super(name, empId);
        this.hrs = hrs;
        this.rate = rate;
    }

    // Method to calculate salary for wage employee
    @Override
    public double computeSalary() {
        return hrs * rate;
    }

    // toString() method to display wage employee details
    @Override
    public String toString() {
        return super.toString() + "\nHours Worked: " + hrs + "\nHourly Rate: $" + rate + "\nSalary: $" + computeSalary();
    }
}

public class Que2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter employee ID: ");
        int empId = scanner.nextInt();

        System.out.print("Enter hours worked: ");
        int hrs = scanner.nextInt();

        System.out.print("Enter hourly rate: ");
        int rate = scanner.nextInt();

        WageEmployee wageEmployee = new WageEmployee(name, empId, hrs, rate);
        System.out.println("\nWage Employee Details:");
        System.out.println(wageEmployee);

        scanner.close();
    }
}

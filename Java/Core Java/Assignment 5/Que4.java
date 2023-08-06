import java.util.Scanner;

class Manager extends Employee {
    public int fixedsalary;
    public int incentives;

    // Default constructor
    public Manager() {
        super();
        this.fixedsalary = 0;
        this.incentives = 0;
    }

    // Parameterized constructor
    public Manager(String name, int empId, int fixedsalary, int incentives) {
        super(name, empId);
        this.fixedsalary = fixedsalary;
        this.incentives = incentives;
    }

    // Override computeSalary() method to include incentives
    @Override
    public double computeSalary() {
        return fixedsalary + incentives;
    }

    // Override toString() method to display Manager details
    @Override
    public String toString() {
        return super.toString() + "\nFixed Salary: $" + fixedsalary + "\nIncentives: $" + incentives + "\nTotal Salary: $" + computeSalary();
    }
}

public class Que4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter employee ID: ");
        int empId = scanner.nextInt();

        System.out.print("Enter fixed salary: ");
        int fixedsalary = scanner.nextInt();

        System.out.print("Enter incentives: ");
        int incentives = scanner.nextInt();

        Manager manager = new Manager(name, empId, fixedsalary, incentives);
        System.out.println("\nManager Details:");
        System.out.println(manager);

        scanner.close();
    }
}

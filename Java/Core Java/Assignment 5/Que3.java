import java.util.Scanner;

class SalesPerson extends WageEmployee {
    int sales;
    int commission;

    // Default constructor
    public SalesPerson() {
        super();
        this.sales = 0;
        this.commission = 0;
    }

    // Parameterized constructor
    public SalesPerson(String name, int empId, int hrs, int rate, int sales, int commission) {
        super(name, empId, hrs, rate);
        this.sales = sales;
        this.commission = commission;
    }

    // Override computeSalary() method to include commission
    @Override
    public double computeSalary() {
        return super.computeSalary() + (sales * commission);
    }

    // Override toString() method to display SalesPerson details
    @Override
    public String toString() {
        return super.toString() + "\nSales: $" + sales + "\nCommission: $" + commission + "\nSalary: $" + computeSalary();
    }
}

public class Que3 {
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

        System.out.print("Enter sales: ");
        int sales = scanner.nextInt();

        System.out.print("Enter commission: ");
        int commission = scanner.nextInt();

        SalesPerson salesPerson = new SalesPerson(name, empId, hrs, rate, sales, commission);
        System.out.println("\nSales Person Details:");
        System.out.println(salesPerson);

        scanner.close();
    }
}

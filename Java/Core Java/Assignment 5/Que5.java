public class Que5 {
    public static void main(String[] args) {
        // Creating different types of employees
        Employee[] employees = new Employee[3];

        // WageEmployee
        employees[0] = new WageEmployee("John", 101, 40, 15);
        // SalesPerson
        employees[1] = new SalesPerson("Alice", 102, 160, 10, 15000, 0.05);
        // Manager
        employees[2] = new Manager("Bob", 103, 50000, 10000);

        // Display details of all employees
        for (Employee emp : employees) {
            System.out.println("==================================");
            System.out.println(emp.getClass().getSimpleName() + " Details:");
            System.out.println("==================================");
            System.out.println(emp);
        }
    }
}


/**
 * Write a description of class Payroll here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Payroll
{
    public static void main(String[] args) {
        PermanentEmployee permEmp = new PermanentEmployee(101, "Alice", 5000, 1000, 500);

        ContractEmployee contractEmp = new ContractEmployee(201, "Bob", 200, 22); // $200 per day, 22 days worked

        System.out.println("---- Permanent Employee ----");
        permEmp.displayEmployee();
        System.out.println("Total Salary: $" + permEmp.calculateTotalSalary());

        System.out.println("\n---- Contract Employee ----");
        contractEmp.displayEmployee();
        System.out.println("Total Salary: $" + contractEmp.calculateTotalSalary());
    }

}

/**
 * Write a description of class ContractEmployee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class ContractEmployee extends Employee {
    int workingDays;

    public ContractEmployee(int employeeId, String name, double basicSalary, int workingDays) {
        super(employeeId, name, basicSalary); 
        this.workingDays = workingDays;
    }

    public double calculateTotalSalary() {
        return basicSalary * workingDays;
    }

    public void displayEmployee() {
        super.displayEmployee(); 
        System.out.println("Working Days: " + workingDays);
    }
}

/**
 * Write a description of class ParentEmployee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class PermanentEmployee extends Employee {
    double hra; 
    double da;  

    public PermanentEmployee(int employeeId, String name, double basicSalary, double hra, double da) {
        super(employeeId, name, basicSalary); 
        this.hra = hra;
        this.da = da;
    }

    public double calculateTotalSalary() {
        double bonus = super.calculateBonus(); 
        return basicSalary + hra + da + bonus;
    }

    public void displayEmployee() {
        super.displayEmployee(); 
        System.out.println("HRA: $" + hra);
        System.out.println("DA: $" + da);
    }
}
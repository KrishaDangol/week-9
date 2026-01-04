
/**
 * Write a description of class Staff here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class Staff extends Person {
    int workingHours;
    double ratePerHour;

    Staff(int id, String name, int workingHours, double ratePerHour) {
        super(id, name, 0); 
        this.workingHours = workingHours;
        this.ratePerHour = ratePerHour;
    }

    double calculateSalary() {
        return workingHours * ratePerHour;
    }
}

/**
 * Write a description of class Teacher here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class Teacher extends Person {
    String subject;
    double bonus;

    Teacher(int id, String name, double basicSalary, String subject, double bonus) {
        super(id, name, basicSalary);
        this.subject = subject;
        this.bonus = bonus;
    }

    double calculateAnnualSalary() {
        return super.calculateAnnualSalary() + bonus;
    }
}

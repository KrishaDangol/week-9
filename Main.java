
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args) {

        Teacher teacher = new Teacher(1, "Alice", 40000, "Math", 50000);
        System.out.println("Teacher Annual Salary: " + teacher.calculateAnnualSalary());

        Staff staff = new Staff(2, "Bob", 160, 300);
        System.out.println("Staff Salary: " + staff.calculateSalary());

        System.out.println("College Name: " + Person.collegeName);
    }
}
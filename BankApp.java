
/**
 * Write a description of class BankApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankApp
{
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(1001, "Alice", 5000, 5); 

        CurrentAccount current = new CurrentAccount(2001, "Bob", 2000, 1000); 
        
        System.out.println("Savings Account");
        savings.displayAccountInfo();
        System.out.println("Interest Earned: $" + savings.calculateInterest());

        savings.deposit(1000);
        System.out.println("Balance after deposit: $" + savings.getBalance());

        System.out.println(" Current Account");
        current.displayAccountInfo();

        current.withdraw(2500);
        System.out.println("Balance after withdrawal: $" + current.getBalance());

        current.withdraw(1000); 
        System.out.println("Balance after attempted withdrawal: $" + current.getBalance());
    }
}
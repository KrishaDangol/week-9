
/**
 * Write a description of class CurrentAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class CurrentAccount extends BankAccount {
    double overdraftLimit;
    public CurrentAccount(int accountNumber, String accountHolderName, double balance, double overdraftLimit) {
        super(accountNumber, accountHolderName, balance); 
        this.overdraftLimit = overdraftLimit;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful.");
            return true;
        } else {
            System.out.println("Withdrawal denied. Exceeds overdraft limit.");
            return false;
        }
    }
    
    public void displayAccountInfo() {
        super.displayAccountInfo();
        System.out.println("Overdraft Limit: $" + overdraftLimit);
    }
}

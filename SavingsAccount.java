
/**
 * Write a description of class SavingAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class SavingsAccount extends BankAccount {
    double interestRate; 
    public SavingsAccount(int accountNumber, String accountHolderName, double balance, double interestRate) {
        super(accountNumber, accountHolderName, balance); 
        this.interestRate = interestRate;
    }

    public double calculateInterest() {
        return super.getBalance() * interestRate / 100;
    }

    public void displayAccountInfo() {
        super.displayAccountInfo();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

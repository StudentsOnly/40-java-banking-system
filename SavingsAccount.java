public class SavingsAccount extends BankAccount {

    private double interestRate;

    @Override
    public void deposit(double amount) {

        setBalance(getBalance() + amount);
        System.out.println("Deposited $" + amount + " to " + getAccountHolder());
        System.out.println("Current Total: $" + getBalance());
        displayAccountInfo();
        System.out.println();
    }

    @Override
    public void withdraw(double amount) {

        setBalance(getBalance() - amount);
        System.out.println("Withdrew $" + amount + " from " + getAccountHolder());
        System.out.println("Current Total: $" + getBalance());
        displayAccountInfo();
        System.out.println();
    }

    @Override
    public void displayAccountInfo() {

        System.out.println("Acc. Number: " + getAccountNumber() + " Holder: " + getAccountHolder()
        + " Balance: $" + getBalance() + " Type: " + getClass().getSimpleName() + " Interest Rate: $" + interestRate);
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}

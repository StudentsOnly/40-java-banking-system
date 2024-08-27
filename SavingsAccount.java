public class SavingsAccount extends BankAccount {

    private double interestRate;

    @Override
    public void deposit(double amount) {

        balance += amount;
        System.out.println("Deposited $" + amount + " to " + accountHolder);
        System.out.println("Current Total: $" + balance);
    }

    @Override
    public void withdraw(double amount) {

        balance -= amount;
        System.out.println("Withdrew $" + amount + " from " + accountHolder);
        System.out.println("Current Total: $" + balance);
    }

    @Override
    public void displayAccountInfo() {

        System.out.println("Acc. Number: " + accountNumber + " Holder: " + accountHolder
        + " Balance: $" + balance + " Type" + getClass().getSimpleName() + " Interest Rate: $" + interestRate);
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}

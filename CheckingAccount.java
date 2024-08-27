public class CheckingAccount extends BankAccount {
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, String accountHolder, double balance, double overdraftLimit) {
        super(accountNumber, accountHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            setBalance(getBalance() + amount);
            System.out.println("Deposited €" + amount + " to CheckingAccount.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && getBalance() + overdraftLimit >= amount) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrew €" + amount + " from CheckingAccount.");
        } else {
            System.out.println("Invalid or insufficient balance for withdrawal.");
        }
    }

    @Override
    public void displayAccountInfo() {
        System.out.println("Checking Account Number: " + getAccountNumber());
        System.out.println("Account Holder: " + getAccountHolder());
        System.out.println("Balance: €" + getBalance());
        System.out.println("Overdraft Limit: €" + overdraftLimit);
    }
}


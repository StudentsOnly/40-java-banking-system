public class CheckingAccount extends BankAccount {

    private double overdraftLimit;

    @Override
    public void deposit(double amount) {

        setBalance(getBalance() + amount);
        System.out.println("Deposited $" + amount + " to " + getAccountHolder());
        System.out.println("Current Total: $" + getBalance());
        System.out.println();
        displayAccountInfo();
        System.out.println();
    }

    @Override
    public void withdraw(double amount) {

        if(getBalance() - amount < overdraftLimit) {
            System.out.println("Can not withdraw $" + amount + " from " + getAccountHolder());
            System.out.println("Current Balance: $" + getBalance() + " Overdraft-Limit: $" + overdraftLimit);
            displayAccountInfo();
            System.out.println();
            return;
        }
        setBalance(getBalance() - amount);
        System.out.println("Withdrew $" + amount + " from " + getAccountHolder());
        System.out.println("Current Total: $" + getBalance());
        displayAccountInfo();
        System.out.println();
    }

    @Override
    public void displayAccountInfo() {

        System.out.println("Acc. Number: " + getAccountNumber() + " Holder: " + getAccountHolder()
                + " Balance: $" + getBalance() + " Type: " + getClass().getSimpleName() + " Overdraft-limit: $" + overdraftLimit);
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
}

public class CheckingAccount extends BankAccount {

    private double overdraftLimit;

    @Override
    public void deposit(double amount) {

        balance += amount;
        System.out.println("Deposited $" + amount + " to " + accountHolder);
        System.out.println("Current Total: $" + balance);
        System.out.println();
        displayAccountInfo();
        System.out.println();
    }

    @Override
    public void withdraw(double amount) {

        if(balance - amount < overdraftLimit) {
            System.out.println("Can not withdraw $" + amount + " from " + accountHolder);
            System.out.println("Current Balance: $" + balance + " Overdraft-Limit: $" + overdraftLimit);
            displayAccountInfo();
            System.out.println();
            return;
        }
        balance -= amount;
        System.out.println("Withdrew $" + amount + " from " + accountHolder);
        System.out.println("Current Total: $" + balance);
        displayAccountInfo();
        System.out.println();
    }

    @Override
    public void displayAccountInfo() {

        System.out.println("Acc. Number: " + accountNumber + " Holder: " + accountHolder
                + " Balance: $" + balance + " Type" + getClass().getSimpleName() + " Overdraft-limit: $" + overdraftLimit);
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
}

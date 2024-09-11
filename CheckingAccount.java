class CheckingAccount extends BankAccount {
    private double overdraftLimit;

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) { //When a method is passed an argument that is inappropriate or invalid for its operation.
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
           // System.out.println("Invalid deposit amount.");
            throw new IllegalArgumentException("Invalid deposit amount.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance + overdraftLimit) { //When a method is passed an argument that is inappropriate or invalid for its operation.
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
           // System.out.println("Invalid withdrawal amount.");
            throw new IllegalArgumentException("Invalid withdrawal amount.");
        }
    }

    @Override
    public void displayAccountInfo() {
        System.out.println("Checking Account Info:");
        System.out.println("Account Holder: " + getAccountHolder());
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Balance: " + getBalance());
        System.out.println("Overdraft Limit: " + getOverdraftLimit());
    }
}

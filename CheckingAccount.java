public class CheckingAccount extends BankAccount{
    private double overdraftLimit = 1100;

    public CheckingAccount(String accHolder, String accNumber, double balance){
        this.setAccountHolder(accHolder);
        this.setAccountNumber(accNumber);
        this.setBalance(balance);
    }

    public CheckingAccount(){
        this("", "0000000000", 0);
    }

    @Override
    public void deposit(double amount){
        this.setBalance(this.getBalance() + amount);
    }

    @Override
    public boolean withdraw(double amount){
        if (this.getBalance() + overdraftLimit < amount){
            return false;
        } else{
            this.setBalance(this.getBalance() - amount);
            return true;
        }
    }

    @Override
    public void displayAccountInfo(){
        System.out.println("Account type: Checking account");
        System.out.println("Account number: " + this.getAccountNumber());
        System.out.println("Account holder: " + this.getAccountHolder());
        System.out.printf("Balance: $%.2f\n", this.getBalance());
        System.out.println("Overdraft limit: $" + this.overdraftLimit);
    }

}

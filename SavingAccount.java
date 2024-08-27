public class SavingAccount extends BankAccount{
    private double interestRate = 0.02460;

    public SavingAccount(String accHolder, String accNumber, double balance){
        this.setAccountHolder(accHolder);
        this.setAccountNumber(accNumber);
        this.setBalance(balance);
    }

    public SavingAccount(){
        this("", "0000000000", 0);
    }

    @Override
    public void deposit(double amount){
        this.setBalance(this.getBalance() + amount * (1 + interestRate));
    }

    @Override
    public boolean withdraw(double amount){
        if (this.getBalance() < amount){
            return false;
        } else{
            this.setBalance(this.getBalance() - amount);
            return true;
        }
    }

    @Override
    public void displayAccountInfo(){
        System.out.println("Account type: Saving account");
        System.out.println("Account number: " + this.getAccountNumber());
        System.out.println("Account holder: " + this.getAccountHolder());
        System.out.printf("Balance: $%.2f\n", this.getBalance());
        System.out.println("Interest rate: " + this.interestRate * 100 + "%");
    }

}

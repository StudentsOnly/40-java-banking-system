public abstract class BankAccount{
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public String getAccountNumber(){
        return accountNumber;
    }

    public boolean setAccountNumber(String accountNumber){
        if (accountNumber.matches("[0-9]{10}")){
            this.accountNumber = accountNumber;
            return true;
        } else return false;

    }

    public String getAccountHolder(){
        return accountHolder.charAt(0) + accountHolder.substring(1).toLowerCase();
    }

    public void setAccountHolder(String accountHolder){
        this.accountHolder = accountHolder.toUpperCase();
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public abstract void deposit(double amount);

    public abstract boolean withdraw(double amount);

    public abstract void displayAccountInfo();

}

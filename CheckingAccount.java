public class CheckingAccount extends BankAccount{

    private double overdraftLimit;

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        this.setBalance(this.getBalance() + amount);
        System.out.println("successful 'deposit' transaction +" + amount + "$" );
    }

    @Override
    public void withdraw(double amount) {
        double sum = this.getBalance() - amount;
        if(sum < this.getOverdraftLimit() * (-1)){
            System.out.println("insufficient balance - 'withdraw' transaction declined");
        }else{
            this.setBalance(sum);
            System.out.println("successful 'withdraw' transaction -" + amount + "$" );
        }

    }

    @Override
    public void displayAccountInfo() {
        System.out.println("\nAccount:");
        System.out.println("\tAccount number: " + this.getAccountNumber());
        System.out.println("\tHolder: " + this.getAccountHolder());
        System.out.println("\tBalance: " + this.getBalance() + "$");
        System.out.println("\tOverdraft limit: " + this.getOverdraftLimit() + "$");
        System.out.println();
    }
}

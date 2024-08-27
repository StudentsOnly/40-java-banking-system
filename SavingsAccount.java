public class SavingsAccount extends BankAccount{

    private double interestRate;

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        this.setBalance(this.getBalance() + amount);
        System.out.println("successful 'deposit' transaction +" + amount + "$" );
    }

    @Override
    public void withdraw(double amount) {
        double sum = this.getBalance() - amount;
        if(sum < 0){
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
        System.out.println("\tInterest rate: " + this.getInterestRate() + "%");
        System.out.println();
    }
}

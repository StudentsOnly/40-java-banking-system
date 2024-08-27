public class Main{
    public static void main(String[] args) {

        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.setAccountHolder("Barbara Johnson");
        savingsAccount.setAccountNumber("BA123");
        savingsAccount.setInterestRate(3.5);
        savingsAccount.deposit(5000);
        savingsAccount.withdraw(456);
        savingsAccount.displayAccountInfo();

        System.out.println();

        CheckingAccount checkingAccount = new CheckingAccount();
        checkingAccount.setAccountHolder("John Smith");
        checkingAccount.setAccountNumber("BA126");
        checkingAccount.setOverdraftLimit(500);
        checkingAccount.deposit(7788);
        checkingAccount.withdraw(456);
        checkingAccount.displayAccountInfo();
    }
}

public class Main{

    public static void main(String[] args) {

        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.setAccountNumber("123456");
        savingsAccount.setAccountHolder("Ralf Wiggler");
        savingsAccount.setBalance(5000.00);
        savingsAccount.setInterestRate(0.05);
       
        savingsAccount.deposit(100.00);
        savingsAccount.withdraw(200.00);

        CheckingAccount checkingAccount = new CheckingAccount();
        checkingAccount.setAccountNumber("912375");
        checkingAccount.setAccountHolder("Dolf Retro");
        checkingAccount.setBalance(2000.00);
        checkingAccount.setOverdraftLimit(1000.00);

        checkingAccount.deposit(100.00);
        checkingAccount.withdraw(3200.00);


    }
}

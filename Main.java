public class Main {
    public static void main(String[] args) {

        System.out.println("\t====Savings Account Details====");
        SavingsAccount savingsAccount = new SavingsAccount("1234 2345 3456 4567", "MARY SMITH", 459.0, 2.5);
        savingsAccount.displayAccountInfo();
        savingsAccount.deposit(500.0);
        savingsAccount.withdraw(200.0);
        savingsAccount.displayAccountInfo();


        System.out.println("\t====Checking Account Details====");
        CheckingAccount checkingAccount = new CheckingAccount("9876 8765 7654 6543", "JOHN SMITH", 1500.0, 2500.0);
        checkingAccount.displayAccountInfo();
        checkingAccount.deposit(300.0);
        checkingAccount.withdraw(2000.0);
        checkingAccount.displayAccountInfo();
    }
}

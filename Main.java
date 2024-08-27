public class Main{
    public static void main(String[] args) {

        SavingsAccount savings = new SavingsAccount();
        CheckingAccount account = new CheckingAccount();

        savings.setAccountHolder("Jessica Wolf");
        savings.setAccountNumber("654789321");
        savings.setBalance(1500);
        savings.setInterestRate(4);

        account.setAccountHolder("Tobias Lin");
        account.setAccountNumber("963852741");
        account.setBalance(200);
        account.setOverdraftLimit(500);

        savings.displayAccountInfo();
        savings.withdraw(2000);
        savings.deposit(1200);
        savings.withdraw(2000);
        savings.displayAccountInfo();

        System.out.println();

        account.displayAccountInfo();
        account.deposit(750);
        account.withdraw(1400);
        account.withdraw(300);
        account.displayAccountInfo();
    }

}

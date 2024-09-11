public class Main{
    public static void main(String[] args) {

        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.setAccountHolder("Barbara Johnson");
        savingsAccount.setAccountNumber("BA123");
        savingsAccount.setInterestRate(3.5);
        try{
        savingsAccount.deposit(5000);
        savingsAccount.withdraw(456);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        finally {
            savingsAccount.displayAccountInfo();
            System.out.println();
        }


        CheckingAccount checkingAccount = new CheckingAccount();
        checkingAccount.setAccountHolder("John Smith");
        checkingAccount.setAccountNumber("BA126");
        checkingAccount.setOverdraftLimit(500);
        try {
            checkingAccount.deposit(7788);
            checkingAccount.withdraw(456);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        finally {
            checkingAccount.displayAccountInfo();
        }

    }
}

public class Main{
    public static void main(String[] args){
        SavingAccount savingAcc = new SavingAccount("aLeX", "0123456789", 5000);

        while (!savingAcc.withdraw(7000)){
            savingAcc.deposit(500);
        }
        savingAcc.displayAccountInfo();

        System.out.println("\n");

        CheckingAccount checkingAcc = new CheckingAccount();
        checkingAcc.setAccountNumber("9876543210");
        checkingAcc.setAccountHolder("jOHn");
        checkingAcc.setBalance(4000);

        while (!checkingAcc.withdraw(7000)){
            checkingAcc.deposit(400);
        }
        checkingAcc.displayAccountInfo();
    }

}

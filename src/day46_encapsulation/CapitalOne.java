package day46_encapsulation;

public class CapitalOne {
    public static void main(String[] args) {
        CheckingAccount bankAccount = new CheckingAccount();
        bankAccount.setBalance(20.01);
        System.out.println(bankAccount.getBalance()+ "$ ");
        bankAccount.getAccountNumber(12345678);
        System.out.println("bankAccount.getAccountNumber(12345678) = " + bankAccount.getAccountNumber(12345678));

    }
}
//    n generate you can choose Setter ->
//    choose all -> enter. Again generate -> getter -> choose all -> enter
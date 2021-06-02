package day49_static;

public class MyBankAccount {
    static double balance = 500;
    static String user;

    static void spend (double amount){
        System.out.println(user + " is spending $ "+amount);
        balance-=amount;
    }
    public void showBalance(){
        System.out.println("MY balance = " + balance);
    }
}

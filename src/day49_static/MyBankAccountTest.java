package day49_static;

public class MyBankAccountTest {
    public static void main(String[] args) {
        MyBankAccount me = new MyBankAccount();
        me.user = "INK";
        me.showBalance();
        me.spend(10.00);
        me.showBalance();

        MyBankAccount you = new MyBankAccount();
        you.user = "YouSelf";
        you.showBalance();
        you.spend(20);
        you.showBalance();

        System.out.println("MyBankAccount.balance = " + MyBankAccount.balance);
    }
}

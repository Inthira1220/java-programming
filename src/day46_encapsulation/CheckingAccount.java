package day46_encapsulation;

public class CheckingAccount {
    private double balance;
    private int accountNumber;
    private int accountHolder;
    private String type = "checking";

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountNumber(int i) {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(int accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAccountInfo(int accountNumber, String accountHolder, double balance, String type) {

    }


}

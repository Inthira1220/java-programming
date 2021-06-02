package day10_shorthand_operators;

public class ChangeBalance {
    public static void main(String[] args) {
        double balance = 1230.55; //declareBalance = 1200.44
        System.out.println("balance = " +balance);
        double baklava = 22.50;
        System.out.println("baklava = "+ baklava);
        balance = balance - baklava;
        System.out.println("-----> balance after bakalva = " + balance);
        double kenafa = 44.45;
        System.out.println("kanafa = "+ kenafa);
        kenafa = 44.45/2;
        System.out.println("kanafa 50% discount = "+ kenafa);
        balance = balance - kenafa;
        System.out.println("-----> balance after with kanafa 50% = " + balance);
        double ploy = 7.99;
        System.out.println("ploy = " + ploy);
        balance = balance - ploy;
        System.out.println("-----> balance after ploy = " + balance);
        double iceTea = 3.0;
        System.out.println("ice tea = "+ iceTea);
        iceTea = iceTea * 4;
        System.out.println("add 4 Ice Tea = " + iceTea);
        balance = balance - iceTea;
        System.out.println("-----> balance after Ice Tea = " + balance);
        balance = balance + baklava;
        System.out.println("-----> return baklava = " + baklava);
        System.out.println("-----> balance after returning baklava = " + balance);
    }
}
//Total Balance: $1230.55
//Baklava = $22.5
//        After baklava = $1208.05
//Kenafe = $44.45
//        Balance after baklava and kenafe: $1163.6
//        Balance after second %50 off kenafe: $1141.375
//Plov = $7.99
//        After plov we have: $1133.385
//Iced tea = $3.0
//        Balance after all: $1121.385
//        Baklava returned.
//        Balance after returning baklava: $1143.885
//
//Process finished with exit code 0
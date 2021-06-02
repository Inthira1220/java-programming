package day11_comparison_operators;

public class PrePostIncrementDecrementOperators1 {
    public static void main(String[] args) {
        // pre increment
        int num1 = 10;
        int num2 = ++num1; //<= 2 actions here
        System.out.println("Num1 = "+ num1);//11
        System.out.println("Num2 = "+ num2);//11

        // post increment
        int num3 = 10;
        int num4 = num3++;
        System.out.println("Num3 = "+ num3);//11
        System.out.println("Num4 = "+ num4);//10

        // example pre increment = will increase both line and next line will repeat from line 18
        int apples = 5; //6
        int basket = ++apples; //6
        System.out.println("apple = "+ apples);
        System.out.println("basket = " + basket);
        int kiwis = 15;//16
        int kiwisBasket = kiwis++;//15
        System.out.println("kiwis = "+ kiwis);
        System.out.println("kiwisBasket = "+ kiwisBasket);

        //new example
        int cars = 5;
        System.out.println("cars = " + ++cars);
        System.out.println("cars = " +cars);
        int sedans = 10;
        System.out.println( "sedan = "+ sedans++);//10
        System.out.println("sedan = " + sedans);//11
        System.out.println("sedan = " + sedans);

        //
        int aa = 50;
        int bb = 22;
        int cc = aa++ + ++bb;
        System.out.println("aa = "+ aa);//51
        System.out.println("bb = "+ bb);//23
        System.out.println("cc = "+ cc);//73


    }
}

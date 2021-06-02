package day11_comparison_operators;

public class BooleanComparisonOperators {
    public static void main(String[] args) {
        System.out.println(10==10);
        System.out.println(11>10);
        System.out.println(10<11);
        System.out.println(10>=1);
        System.out.println(1<=10);
        System.out.println(1!=2);//   != "call not equal"
        System.out.println("*********************************");
        //
        int a = 100;
        int b = 200;
        System.out.println(a==b);//false
        System.out.println(a>b);//false
        System.out.println(a<b);//true
        System.out.println(a>=b);//false
        System.out.println(a<=b);//true
        System.out.println(a!=b);//true
        System.out.println("*********************************");
        //
        boolean result;
        result = 5 == 5;
        System.out.println("result = " + result);

        result = 33 > 44;
        System.out.println("result = " + result);

        result = 88 < 99;
        System.out.println("result = " + result);

        result = 10 >= 10;
        System.out.println("result = " + result);

        result = 123 <= 124;
        System.out.println("result = " + result);

        result = 2 != 2;
        System.out.println("result = " + result);

        String city = "Seattle";
        System.out.println( city == "Seattle");
        System.out.println( city == "Baku");
        System.out.println( city != "Fairfax");
        System.out.println("*********************************");

        String name = "Nadir";
        boolean checkName = name == "Nadir";
        System.out.println("checkName = " + checkName);

        checkName = name != "Zuzzat";
        System.out.println("checkName = " + checkName);
        System.out.println("*********************************");

        //2-3
        int age = 3;
        boolean noMoreToddler = age > 3;
        System.out.println(noMoreToddler);//false

        // age = 66;
        // boolean seniorCitizen = age;
        //System.out.println("is senior citizen?" + seniorCitizen);//True



    }
}

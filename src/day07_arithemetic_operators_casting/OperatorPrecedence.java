package day07_arithemetic_operators_casting;

public class OperatorPrecedence {
    public static void main(String[] args){
        System.out.println(10+5);
        System.out.println(10+5-3);
        System.out.println(10-5+3);//8
        System.out.println(10-(5+3));//2
        System.out.println(2*3);//6
        System.out.println(2*3/3);//2
        System.out.println(20/(2*2));//5
        //System.out.println(10/0);//Exception in thread "main" java.lang.ArithmeticException: / by zero
                                //run time excepted
        System.out.println(2+5*3);//17
        System.out.println((2+5)*3);//21
    }
}

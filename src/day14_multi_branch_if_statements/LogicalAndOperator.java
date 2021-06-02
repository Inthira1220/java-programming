package day14_multi_branch_if_statements;

public class LogicalAndOperator {
    public static void main(String[] args) {
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);
        System.out.println();
        System.out.println(10 > 5 && 1==1);
        System.out.println(10 < 1 && 10== 1);
        System.out.println(5 > 10 && 10<=1); //false
        System.out.println(20 * 10 < 100 - 50 && 200 * 2 >100 + 5);
        System.out.println();
        int apples = 10, oranges = 5;
        boolean check = apples > 5 && oranges > 3;
        System.out.println(check + " : check");
        System.out.println();
        if (apples > 6 && oranges > 5 ){
            System.out.println("i have apples more than oranges");
        }else{
            System.out.println("I need to go to Walmart to buy some fruit");
        }
    }
}

package day14_multi_branch_if_statements;

public class MultiBranchIfStatement {
    public static void main(String[] args) {
        int day = 2;
        if (day == 1) {

            System.out.println("Monday");
        } else {
            System.out.println("Not Monday");
            System.out.println("no, today is day "+ day);
        }
        if (day==2) {
            System.out.println("Tuesday");
        }else{
            System.out.println("Not Tuesday");
            System.out.println("no, today is day "+ day);
        }
        if (day==3) {
            System.out.println("Wednesday");
        }else{
            System.out.println("Not Wednesday");
            System.out.println("No, today is day "+ day);


        }
        System.out.println("OKay, lets code JAVA on day" + day);
         //last result from line number 5 , int day = 3
        }
    }


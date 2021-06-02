package day12_conditional_statemants;

public class IfElseStatement {
    public static void main(String[] args) {
        if (10 > 5){
            System.out.println("condition is true" );}else{
            System.out.println("condition is false");
        }
        System.out.println();
        int count = 25; //check if count more than 30. it yes, print "cout is more than 30'
                        //otherwise print "out is less than 30
        if ( count > 30 ){
            System.out.println("count is more than 30");}else{
            System.out.println("count is less than 30");
        }
        System.out.println();

        byte age = 14;
        if ( age >= 18 ){
            System.out.println("Eligible to vote.");
            System.out.println("Age is greater or equal to 18");}else{
            System.out.println("Not Eligible is vote");
            System.out.println("Age is less than 18");
        }
    }
}

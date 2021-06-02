package day24_loops;

public class DoWhileLoopJavaShort_apple {
    public static void main(String[] args) {
        int apple = 1;
        do {
            System.out.println("Eating apple : " + apple);//<---run the condition first
            apple++;                    // <--------add value by 1
        } while (apple <= 5);           //<-----then check the boolean
        System.out.println("no more apple");

        int number = 1;
        int until = 17;
//        do {
//            System.out.print(number+", ");
//            number++;
//        } while (number <= until);
//        System.out.println("\nInvalid\n");

        do {
            System.out.print(until + ", ");
            until--;
        } while (until >= number);
        System.out.println("\nInvalid");

        int num1 = 5;
        do {
            System.out.print("&, ");
            num1--;
        } while (num1 >= 1);
        System.out.println();

    }
}


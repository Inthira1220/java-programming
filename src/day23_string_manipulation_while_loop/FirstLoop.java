package day23_string_manipulation_while_loop;

public class FirstLoop {
    public static void main(String[] args) {
        int i = 1;
        if (i <= 5) {
            System.out.println("i --->" +i); //<============1
        }
        while (i <= 5) {
            System.out.println("i = " + i);
            i++; //<============i = 1, 2, 3, 4, 5

        }

        int apples = 0;
        if (apples <= 10) ;
        System.out.println("apples ==> " + apples);

        while (apples <= 3) {
            System.out.println("apples = " + apples);
            apples++;

        }
        System.out.println("apples = " + apples);//4
        System.out.println("apples = " + apples);//4

//        infinite loop
        //while (true) {
            //System.out.println("hello World");
    }
}
//}
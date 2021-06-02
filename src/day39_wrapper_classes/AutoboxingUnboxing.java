package day39_wrapper_classes;

public class AutoboxingUnboxing {
    public static void main(String[] args) {
        //auto-boxing
        int num1 = 500;
        Integer num2 = num1;
        Integer num3 =234;
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);

        // Un-boxing: object > primitive

        Double d1 =  new Double(100.5);
        double d2 = d1;
        System.out.println("d2 = " + d2);


    }
}

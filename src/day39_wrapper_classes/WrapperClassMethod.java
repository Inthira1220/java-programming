package day39_wrapper_classes;

public class WrapperClassMethod {
    public static void main(String[] args) {
        System.out.println(Integer.max(10, 5));
        System.out.println(Integer.sum(50, 35));
        System.out.println(Integer.min(5, 2));
        System.out.println("Min Integer =>" + Integer.MIN_VALUE);
        System.out.println("Min Integer =>" + Integer.MAX_VALUE);

        System.out.println(Double.max(2351.2, 1235.22));
        System.out.println("Double.MIN_VALUE = " + Double.MIN_VALUE);
        System.out.println("Double.MAX_VALUE = " + Double.MAX_VALUE);

        // compare one
        System.out.println(Double.compare(5, 1));
        System.out.println(Double.compare(5, 5)); //if the number is equal will turn 0
        System.out.println(Double.compare(5, 45)); //-1 first is smaller than second number

        System.out.println("Character.isDigit('8') = " + Character.isDigit('8'));
        System.out.println("Character.isDigit('8') = " + Character.isDigit('v'));
        System.out.println("Character.isAlphabetic('Q') = " + Character.isAlphabetic('Q'));
        System.out.println("Character.isLetter('r') = " + Character.isLetter('r'));
        System.out.println("Character.isLetter('r') = " + Character.isLetter('9'));
        char letter = 'A';
        if (Character.isUpperCase(letter)) {
            System.out.println("true, it is upper case");
        } else {
            System.out.println("false");
        }
        String word = "JaVa is FuN";
        for (int i = 0; i < word.length() ; i++) {


            if (Character.isUpperCase(word.charAt(i))) {

                System.out.print(word.charAt(i));
            }
        }
        System.out.println();
        System.out.println("Character.MIN_VALUE = " + Character.MIN_VALUE);
        System.out.println("Character.MAX_VALUE = " + Character.MAX_VALUE);

        System.out.println(Boolean.TRUE);


    }
}


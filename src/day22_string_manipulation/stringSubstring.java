package day22_string_manipulation;

public class stringSubstring {
    public static void main(String[] args) {
        String word = "java is fun";
        /**
         * word.substring(startIndex, endIndex)
         */
        //word.substring(0, 3); //jav
        //word.substring(0, 5);
        System.out.println(word.substring(0, 4));
        System.out.println(word.substring(0, 5));
        System.out.println(word.substring(5, 7));//is
        System.out.println(word.substring(0, 5));
        System.out.println(word.substring(8, 11));//fun


        /**
         * 2) substring(startIndex) - it will read from start  until end
         */
        System.out.println(word.substring(0));//java is fun
        System.out.println(word.substring(8));//fun
        System.out.println(word.substring(5));//is fun
        System.out.println(word.substring(1));//
    }
    }


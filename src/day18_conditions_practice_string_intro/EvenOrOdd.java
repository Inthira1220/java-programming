package day18_conditions_practice_string_intro;

public class EvenOrOdd {
    public static void main(String[] args) {
        int num = 5;

        if (num % 2 == 0){ // sout (num % 2 ) ans => no remainder = even and no remainder
                    //(num % 2 !=1) => is solution become odd

            System.out.println("when num is divisible by 2 : " + num);
        }else {
            System.out.println(num + " is odd");
        }

    }

}

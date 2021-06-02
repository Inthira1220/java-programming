package day28_loops;

import java.util.Random;// random

public class RandomPassword {
    public static void main(String[] args) {
        String source = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_!@#$%^&*";
        Random random = new Random(); //helps generate random number
        String password = "";

        for(int i = 1; i <= 8; i++) { //<-----i random 8 times
            int index = random.nextInt(source.length()); //source random num 0 - 70
            //System.out.println(source.length()); // check source length = 71
            System.out.print(source.charAt(index));

            //add the char to password variable using +=
            password += source.charAt(index); //<--------------shorthand
            //password = password + source.charAt(index);

        }
        System.out.println("\nYour password = " +  password);
    }
}

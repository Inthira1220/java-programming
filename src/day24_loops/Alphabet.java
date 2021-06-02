package day24_loops;

public class Alphabet {
    public static void main(String[] args) {

        char letter = 'a'; //<===================== using char ' '
        while (letter <= 'z') {
            System.out.print(letter +" ");
            letter++;       //<===================== char + 1 = next letter
        }
        System.out.println();
        System.out.println("English alphabet have 26 character");



        System.out.println();
        //print alphabet reverse order
        letter = 'z'; //            <===================== change letter to 'z' minus-- count backward
        while (letter >= 'a') {
            System.out.print(letter+ " ");
            letter--;  //<===================== change to minus
        }
        System.out.println("\nEnglish alphabet have 26 character - reverse!!");

    }
}

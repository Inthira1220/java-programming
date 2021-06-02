package day24_loops;

import java.util.Scanner;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int guessNumber;
        int secretNUmber = 4;

        do {
            System.out.println("Enter your guessing number from 1 - 100\n ");
            guessNumber = scan.nextInt();
            if (guessNumber > secretNUmber) {
                System.out.println("Wrong, your number is too large\n");
            } else if (guessNumber < secretNUmber) {
                System.out.println("Wrong, your number is too small\n");
            }
        } while (guessNumber != secretNUmber);
        System.out.println("awesome!! you won the secret number");

    }
}


/*
add new class GuessTheNumberGame
need Scanner

secretNumber --> 0-100
guessingNumber = 0
DO
    "Guess the secret number"
    guessingNumber -> from nextInt

    if guessingNumber > secretNumber
        print "Wrong, your number is too large"
    if guessingNumber < secretNumber
        print "Wrong, your number is too small"

WHILE (secretNumber is not guessingNumber)

"Congratulations, you won! secret number: 44"

 */
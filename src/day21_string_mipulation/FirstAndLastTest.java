package day21_string_mipulation;

public class FirstAndLastTest {
    public static void main(String[] args) {
        String words = "mom";
        char first = words.charAt(0);
        char last = words.charAt(2);

        if (first == last) {
            System.out.println("First and Last letter match");
        }else{
            System.out.println("First and Last letter mismatch");
        }
        if (words.charAt(0) == words.charAt(2)) {
            System.out.println("First and Last letter match");
        }else{
            System.out.println("First and Last letter mismatch");
        }
        System.out.println("*********************************");
        String Friend = "aziza";
        char firstLetter = Friend.charAt(0);
        int count = Friend.length(); // <====================ดูดีๆๆๆ
        char LastLetter = Friend.charAt(count-1);
        //char LastLetter = Friend.charAt(4);
        //char LastLetter = Friend.charAt(Friend.length()-1); // if we dont no how many word <--(Friend.length()-1)
        System.out.println(firstLetter+ "+" + LastLetter);

        if (firstLetter == LastLetter){
            System.out.println(Friend+ " First and Last letter match ");
        }else{
            System.out.println(Friend+ " First and Last letter mismatch");
        }
    }
}

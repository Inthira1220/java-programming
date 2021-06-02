package ReplitString;

public class FirstLastLetterReplit {
    public static void main(String[] args) {
        String word = "adobe";
        char firstLetter = word.charAt(0);
        int count = word.length();
        char lastLetter = word.charAt(count-1);

//        System.out.println(firstLetter); //a
//        System.out.println(count); //5
//        System.out.println(lastLetter); //e
        System.out.println(firstLetter+""+lastLetter); //ae

    }
}

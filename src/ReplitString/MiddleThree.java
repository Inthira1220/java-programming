package ReplitString;

public class MiddleThree {
    public static void main(String[] args) {
        /**
         * Given a String variable word print the middle three
         * characters if the word is an odd number of characters and has more than
         * 5 characters. If the word does not meet the requirements print invalid.
         * fifteen ==> fte
         */
        String word = "Inthira";
        int countWord = word.length();
        int midWord = countWord/2;
//
       if (countWord > 5 || midWord % 2 ==0  ){
           System.out.println(word.substring(midWord-1,midWord+2));

       }else{
           System.out.println("invalid");
       }

    }
}

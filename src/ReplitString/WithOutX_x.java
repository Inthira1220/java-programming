package ReplitString;

public class WithOutX_x {
    public static void main(String[] args) {
        /**
         * Given a string word, if the first or last chars are 'x' or 'X', print the string without
         * those 'x' or 'X' chars, otherwise print the string unchanged.
         * Example:
         * input: xHiX
         * output: Hi
         */
        //startsWith, endsWith
        //we can get the first Character using substring then make it uppercase
        //then check for whether uppercase or not
        String word = "xHix";
        //xABC// x-->X.equals(x)
        if (word.substring(0,1).equalsIgnoreCase("X")) {
            word = word.substring(1);
        }
        //int lastCharIndex = word.length()-1;
        //String lastCharStr = word.substring(lastCharIndex);
        if(word.substring(word.length()-1).equalsIgnoreCase("X")){
    word= word.substring(0,word.length()-1);
        }
        System.out.println(word);
    }
}

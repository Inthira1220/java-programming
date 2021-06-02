package ReplitString;

public class StringNoEnd {
    public static void main(String[] args) {
        /**
         * Given a String txt print the value without the last letter
         *
         * Ex:
         *
         * Input:
         * foo
         * Hint: Use substring() and length()
         */
        String txt = "foolk";
        int lastLetter = txt.length()-1;

        System.out.println(txt.substring(0, lastLetter));
    }
}

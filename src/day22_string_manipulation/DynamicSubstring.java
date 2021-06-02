package day22_string_manipulation;

public class DynamicSubstring {
    public static void main(String[] args) {
        //substring + index
        String result = "result count:12345";
        System.out.println(result.substring(13));
        System.out.println(result.substring(13, 18));
        //find the index of:
        System.out.println(result.indexOf(":"));
        int colonIndex = result.indexOf(":"); // how to java count for us
        System.out.println("colonIndex = " + colonIndex);
        System.out.println(result.substring(colonIndex+1)); //find colon index then +1 for start from next letter until last one
        //combine to 1 statement
        String today = "i learn [java] today";
        /**
         * fine indexOf [
         *              ]
         * provide them as start, end index for substring
         * to print java
         */
        int start = today.indexOf("[");
        int end = today.indexOf("]");
        //System.out.println(today.substring(start+1, end));
        System.out.println(today.substring(today.indexOf("[")+1, today.indexOf("]")));

    }
}

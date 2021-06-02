package day28_loops;

public class FindUniqueChars {
    public static void main(String[] args) {
        /**
         * Given a string retrieve and print only unique character?
         */
        String word = "javva";
        String unique = "";

        for (int i = 0; i < word.length(); i++) {
            //System.out.println("word - " + i + " - " + word.charAt(i));
            //if word.charAt(i) is not contains in unique
            //add to unique
            if (!unique.contains(word.charAt(i) + "")) {
                unique += word.charAt(i);
            }


        }
        System.out.println("unique word : "+unique); //<----------jav
    }
}

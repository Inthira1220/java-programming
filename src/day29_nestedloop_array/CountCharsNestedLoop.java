package day29_nestedloop_array;

public class CountCharsNestedLoop {
    public static void main(String[] args) {
        /**
         * OUTER 0 - LENGTH {
         *     //char outerChar = word.charAt(OUTER);
         *     int count = 0;
         *     INNER 0 TO LENGTH {
         *         //char innerChar = word.charAt(INNER);
         *
         *         IF outerChar == innerChar
         *             count++;
         *
         *      }
         *      PRINT outerChar + "=" + count
         * }
         * -----------
         * j=1
         * a=2
         * v=1
         * a=2
         * Requirement for what we did now
         * 1) find duplicates and count
         * 2) find unique characters(appearing only once)
         * 3) print character and number of occurences
         */
        String word = "java";

        for (int outer = 0; outer < word.length(); outer++) {
            System.out.println("outer: "+word.charAt(outer));
            int count = 0;
            for (int inner = 0; inner < word.length(); inner++) {
                //System.out.println("outer "+ word.charAt(outer) + " - inner "+word.charAt(inner));
                if(word.charAt(outer) == word.charAt(inner)){
                    count++;
                }
            }
            System.out.println(word.charAt(outer) +" = "+count);
        }


    }
}
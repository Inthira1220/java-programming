package ReplitString;

public class MergeThem {
    public static void main(String[] args) {
        /**
         * You have 2 words, both of them have 3 characters.
         * If either of them does not have exactly 3 characters, print "cannot merge"
         * Merge their characters one by one and print together like below:
         * Input:
         * aok
         * lol
         * Output:
         * alookl
         */

        String word1 = "dog";
        String word2 = "cat";
        if (word1.length() == word2.length()){
            System.out.println(word1.charAt(0)+""+word2.charAt(0)+""+word1.charAt(1)+""+word2.charAt(1)+
                ""+word1.charAt(2)+""+word2.charAt(2));
        }else{
            System.out.println("cannot merge");
        }

    }
}

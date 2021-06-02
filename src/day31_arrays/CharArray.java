package day31_arrays;

public class CharArray {
    public static void main(String[] args) {
        /**
         * char array with following values:
         * 'j', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'f', 'u', 'n'
         */
        char[] letters = {'j', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'f', 'u', 'n'};
        //print each letter using a loop
        for (char each : letters) {
            System.out.print(each+ " ");

        }
        String sentence = new String(letters);
        System.out.println("\nSentence = " + sentence);

        String item = "wooden spoon";
        char[] itemArray = item.toCharArray();
        System.out.println("itemArray.length = "+ itemArray.length);
        System.out.println("item.length() = " + item.length());
    }
}

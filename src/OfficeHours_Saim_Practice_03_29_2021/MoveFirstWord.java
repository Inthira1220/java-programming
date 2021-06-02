package OfficeHours_Saim_Practice_03_29_2021;

public class MoveFirstWord {
    public static void main(String[] args) {
        /**
         * [Move first word]
         *     Given a sentence. Display the sentence with the first word moved to the end of the sentence. Ex:
         *     input: Java is a fun language
         *     output: is a fun language Java
         *     Hint: Use indexOf and substring
         */
        String str = "Java is a fun language";
        int space = str.indexOf(" "); //<---find the first space
        String firstWord = str.substring(0, space);
        System.out.println("firstWord = " + firstWord); // check the first word first
        System.out.println(str.substring(space)); // check after take off 1st word
        System.out.println(str.substring(space+1)+ " "+ firstWord); //+1 mean move 1 forward
    }
}

package day21_string_mipulation;

public class StringCharAt {
    public static void main(String[] args) {


        String word = "java";
        System.out.println(word.charAt(0));
        System.out.println(word.charAt(1));
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(3));
        System.out.println(word + word.length()); //4

        System.out.println("**************************************");
        System.out.println();
        String company = "Cybertek";
        System.out.println("first letter: " +company.charAt(1));//y
        char first = company.charAt(0);
        char second = company.charAt(1);
        char third = company.charAt(2);
        char fourth = company.charAt(3);
        char fifth = company.charAt(4);
        char sixth = company.charAt(5);
        char seventh = company.charAt(6);
        char eighth = company.charAt(7);

        System.out.println(first+" "+second+" "+third+" "+fourth+" "+fifth+" "+sixth+" "+seventh+" "+eighth);
        System.out.println(first+"\t"+second+"\t"+third+"\t"+fourth+"\t"+fifth+"\t"+sixth+"\t"+seventh+"\t"+eighth);
        
        String withSpaces = (first+" "+second+" "+third+" "+fourth+" "+fifth+" "+sixth+" "+seventh+" "+eighth);
        System.out.println("withSpaces = " + withSpaces);




    }
}

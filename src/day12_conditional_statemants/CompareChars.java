package day12_conditional_statemants;

public class CompareChars {
    public static void main(String[] args) {
        char letter1= 'A';//65
        char letter2= 'a';//
        System.out.println(letter1==letter2);
        System.out.println(letter1<letter2);
        System.out.println(letter1>letter2);
        System.out.println(letter1<=letter2);
        System.out.println(letter1>=letter2);
        System.out.println(letter1!=letter2);

        System.out.println("");
        char grade = 'E';
        boolean pass = grade <= grade;
        System.out.println("Did you pass the exam? "+ pass);
    }

}

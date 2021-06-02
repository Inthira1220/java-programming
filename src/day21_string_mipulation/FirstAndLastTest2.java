package day21_string_mipulation;

public class FirstAndLastTest2 {
    public static void main(String[] args) {


       String word = "level";
       char first = word.charAt(0);
       char last = word.charAt(word.length()-1);
        if (first == last){
            System.out.println("same " + first + " and "+ last);
        }else{
            System.out.println("not same");
        }



    }
}

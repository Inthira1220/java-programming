package day22_string_manipulation;

public class ReverseUsingCharAt {
    public static void main(String[] args) {

        String word = "Java";
        System.out.println(word.charAt(3)+""+word.charAt(2)+""+word.charAt(1)+""+word.charAt(0)); //avaJ
        System.out.println(word); //Java
        String word2 = ""+word.charAt(3)+""+word.charAt(2)+""+word.charAt(1)+""+word.charAt(0);
        System.out.println("word = "+ word);
        System.out.println("word2 = "+ word2);

        if(word.equalsIgnoreCase(word2)){
            System.out.println("palindrome word");
        }else{
            System.out.println("not palindrome word");
        }

//   OR:      String word ="java";
//            char a = (word.charAt(0));
//            char b =(word.charAt(1));
//            char c =(word.charAt(2));
//            char d =(word.charAt(3));
//
//            System.out.println(d+""+c+""+b+""+a+"");
    }
}

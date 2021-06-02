package ReplitTest;

public class MiddleThree {
    public static void main(String[] args) {
        String word = "fifteen";
        //String word2 = "apple";
        //String word = "hey";

        int count = word.length();
        int midPoint = count / 2;

        if(count %2 == 0 || count < 5){
            System.out.println("invalid");
        }else{
            System.out.println(word.substring(midPoint-1, midPoint+2));
        }
         System.out.println(word.substring(midPoint - 1, midPoint + 2));
        }
    }



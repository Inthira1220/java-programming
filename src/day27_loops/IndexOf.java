package day27_loops;

public class IndexOf {
    public static void main(String[] args) {
        String word = "github";
        char letter = 'q';
        int index = -1;// means, if its -1, then its not there
        // if letter=charAt(i), store the i value into index


        for (int i = 0; i < word.length() ; i++) {
            //System.out.println(i + " - " + word.charAt(i));
            if(word.charAt(i)==letter){
                index = i;
                System.out.println(letter+ " is found at index "+ index);
                break; //exit for loop
            }
        }
        if(index == -1){
            System.out.println(letter+ " is not present");
        }

    }
}

package day31_arrays;

import java.util.Arrays;

public class StringToCharAray {
    public static void main(String[] args) {
        String item = "wooden spoon";  //Ctrl+Left Click with Windows
        char[] itemArray = item.toCharArray();

        System.out.println("itemArray.length = " + itemArray.length); //this length is array variable ; itemArray.length = 12
        System.out.println("item.length() = " + item.length()); //String class is string ; item.length() = 12

        String[] fruits = {"bananas", "apples", "kiwi", "mango", "papaya", "strawberry"};

        String fruitStr = "";

        System.out.println(String.join("|", fruits));
        for (String each : fruits) {
            System.out.print(each + "-");//bananas-apples-kiwi-mango-papaya-strawberry-
            fruitStr += each + "-";
        }
        System.out.println("\nfruitStr = " + fruitStr);//fruitStr = bananas-apples-kiwi-mango-papaya-strawberry-

        String[] languages = {"java", "python", "c++", "sql", "ruby", "javascript"};
        System.out.println(String.join("|", languages)); //"join" add from JAVA 8
        System.out.println(String.join("##", languages)); //java##python##c++##sql##ruby##javascript
        String joinLanguages = String.join(" <> ", languages);
        System.out.println("JoinLanguages = "+ joinLanguages);//JoinLanguages = java <> python <> c++ <> sql <> ruby <> javascript
    }
}

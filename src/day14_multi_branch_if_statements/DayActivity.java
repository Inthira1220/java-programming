package day14_multi_branch_if_statements;

public class DayActivity {
    public static void main(String[] args) {

        String weather = "windy";

        System.out.println("What is the weather today");

        if (weather.equals("sunny")) {
            System.out.println("it is "+weather +" Go to park, hiking, and code java");
        } else if (weather.equals("rainny")) {
            System.out.println("it is "+weather +" stay home, drink tea, and code java");
        } else if (weather.equals("snowy")) {
            System.out.println("it is "+weather +" clean the car then build snowman, drink hot chocolate, and code java");
        } else if (weather.equals("windy")) {
            System.out.println("it is "+weather +" Get ready for power loss, fly a kite, and code java");
        } else {
            System.out.println(" \'just keep coding java\'");//something else
        }
    }
}


/*

when "sunny" :
    -> "Go to park, hiking, and code java"

when "rainy" :
    -> "stay home, drink tea, and code java"

when "snowy" :
    -> "clean the car then build snowman, drink hot chocolate, and code java"

when "windy" :
    -> "Get ready for power loss, fly a kite, and code java"

anything else:
    -> "just keep coding java"
 */

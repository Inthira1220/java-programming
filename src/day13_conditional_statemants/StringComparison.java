package day13_conditional_statemants;

public class StringComparison {
    public static void main(String[] args) {

        String city = "Los Angeles";
        if (city.equals("Los Angles")){ //== using . instead ;cannot be referenced from a static context
            System.out.println("It is LA");
        }else {
            System.out.println("It is not LA");
        }
        String weather = "sunny";
        if (weather.equals("sunny")){
            System.out.println("Lets go out and code java");
        }else {
            System.out.println("Lets stay indoors and code java!");

        }

    }
}

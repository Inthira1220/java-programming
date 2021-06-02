package day25_loops;

public class PrintStars {
    public static void main(String[] args) {

       for (int stars = 1; stars <=15 ; stars++){
           System.out.print("* ");
       }
        System.out.println("\n------------------------------------------");

        String myStars = "";
        //for loop: fill 5 star to my stars to myStars variable
        for (int i = 1; i <= 5; i++){

            myStars += "* "; //<=================================add value of star
        }
        System.out.println("my star = "+ myStars);
        System.out.println("my star = "+ myStars.trim()); //ทริม last space


    }
}

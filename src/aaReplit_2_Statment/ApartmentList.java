package aaReplit_2_Statment;

public class ApartmentList {
    public static void main(String[] args) {
        /**
         * Welcome to Cybertek Apartments!
         * Number of bedrooms you are interested:
         * 1
         * One Bedroom Selected
         * Starting Price: 1100
         */
        int numberOfBedrooms = 5;
        int startingPrice = 0;
        int oneBedroom = 1100;
        int twoBedroom = 1850;
        int threeBedroom = 2550;
        System.out.println("number of bedroom = 5");
        if (numberOfBedrooms == 1) {
            System.out.println("One Bedroom Selected");
            System.out.println("Starting Price: " + oneBedroom);
        } else if (numberOfBedrooms == 2) {
            System.out.println("Tne Bedroom Selected");
            System.out.println("Starting Price: " + twoBedroom);
        } else if (numberOfBedrooms == 3){
            System.out.println("Three Bedroom Selected");
            System.out.println("Starting Price: "+threeBedroom);
        }else{
            System.out.println("No such Bedrooms available");
        }
    }
}

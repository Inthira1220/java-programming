package ReplitTest;

import java.util.Scanner;

public class leasingOffice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Cybertek Apartments!");
        System.out.println("Number of bedrooms you are interested:");
        int numberOfBedrooms = scan.nextInt();
        int startingPrice = 0;
        int oneBedRoom = 1100;
        int twoBedRoom = 1850;
        int threeBedRoom = 2250;
        switch (numberOfBedrooms) {
            case 1:
                System.out.println("One Bedroom Selected");
                oneBedRoom = 1100;
                System.out.println("Starting Price: "+oneBedRoom);
                break;
            case 2:
                System.out.println("Two Bedroom Selected");
                twoBedRoom = 1850;
                System.out.println("Starting Price: "+twoBedRoom);
                break;
            case 3:
                System.out.println("Three Bedroom Selected");
                threeBedRoom = 2250;
                System.out.println("Starting Price: "+threeBedRoom);
                break;
            default:
                System.out.println("No such Bedrooms available");
                break;

        }

    }
}

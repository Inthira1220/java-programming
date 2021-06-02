package day16_switch_ternary;

public class AdaireApartment {
    public static void main(String[] args) {

        System.out.println("**********Welcome to Adaire Apartment******************");
        int numberOfBedRoom = 5; //1,2,3
        int startingPrice = 0;

        switch (numberOfBedRoom) {
            case 0:
                startingPrice = 1454;
                System.out.println("Studio apartment selected");
                break;
            case 1:
                startingPrice = 1725;
                System.out.println("One bedroom apartment selected");
                break;
            case 2:
                startingPrice = 2899;
                System.out.println("Two bedrooms apartment selected");
                break;
            case 3:
                startingPrice = 4500;
                System.out.println("four bedrooms apartment selected");
                break;
            default:
                System.out.println(numberOfBedRoom+ " bedroom currently unavailable !!");
                return; // exist main method
                //break; will print out the rest below
        }
        System.out.println();
        System.out.println("Adaire Apartment: Price Starting from $" + startingPrice);
        System.out.println("****************Thank you very much*************************");
    }
}

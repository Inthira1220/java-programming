package OfficeHours_Saim_Practice_03_03_2021;

public class Apartment {
    public static void main(String[] args) {
        String address = "10519 Hunting Crest Lane Vienna, VA 22182";
        String nameOfOwner = "Inthira K";
        int numberOfUnit = 100 ;
        int sizeOfEachUnit = 50 ;
        int monthlyRentAmount = 1000;
        int numberOfWasherAndDryer = 1;
        boolean isAllowPetOrNot = true;
        boolean hasAirConditioning = true;
        boolean isNearGasStation = true;
        int lengthOfLease = 1;
        int totalNumberOfResidentsInBuilding = 100;
        int numberOfFloors = 3;
        boolean  hasABasement = true;
        boolean hasAvailableUnitsForRent = true;
        int numberOfParkingSpaces = 2;
        boolean hasWheelChairAccess = true;
        String numberOfReviewStars = "(5 out of 5)";

        double rent = (monthlyRentAmount * 90)/100;
        System.out.println("***************Apartment of Rent****************");
        System.out.println("----Apartment Detail----"+ "\nOwner Name: "+ nameOfOwner+"\n" + "Address: " +address);
        System.out.println("Floor: "+numberOfFloors);
        System.out.println("Monthly rent: $"+ monthlyRentAmount+ " (From 37th month will get 10% discount.) ");
        System.out.println("Length of Lease: "+ lengthOfLease+ "Year at least.");
        System.out.println("Resident Building : " + totalNumberOfResidentsInBuilding);
        System.out.println("Number of washer and dryer: " + numberOfWasherAndDryer);
        System.out.println("Pet: "+ isAllowPetOrNot);
        System.out.println("Air Condition and Near Gas Station: "+ hasAirConditioning);
        System.out.println("Unit Number: "+ numberOfUnit+ "\nParking spot: "+ numberOfParkingSpaces);
        System.out.println("Wheel Chair Access: "+ hasWheelChairAccess);
        System.out.println("Basement: "+ hasABasement);
        System.out.println("Review of this Apartment: "+ numberOfReviewStars);
        System.out.println("-------------More Detail------------");
        System.out.println("BY monthly the rent after 3 year will get discount 10% of original price rental = "
                + (rent) + "$ Starting at month 37th");
        System.out.println("Average number of resident per unit: " + (totalNumberOfResidentsInBuilding/numberOfUnit));
        System.out.println("Average number of parking spots per unit: "+ numberOfParkingSpaces);
        System.out.println("Average number of units per floor: " + ( numberOfUnit / numberOfFloors));

    }
}
/*
create a class named Apartment
create a main method

    Create the variables with the most appropriate datatype:

        - address, name of owner, number of units, average size of each unit,
        monthly rent amount, number of washers and driers,
        allows pets or not, has a pool, length of lease,
        total number of residents in building, phone number of owner, is near a gas station,
        number of floors, has a basement, has available units for rent, has air conditioning,
        number of parking spaces, has wheel chair access, number of review stars (out of 5)

        - Create these variables and use previous variables to get the values

            - monthly rent after 3 years (discount 10% off original rent)
            - monthly rent after 6 years (discount 20% off original rent)
            - Average number of residents per unit (total residents / number of units)
            - Average number of parking spots per unit ( parking spots / units)
            - Average number of units per floor ( units / number of floors)
 */
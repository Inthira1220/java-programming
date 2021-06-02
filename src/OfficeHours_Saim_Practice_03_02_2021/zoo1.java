package OfficeHours_Saim_Practice_03_02_2021;

public class zoo1 {

    public static void main(String [] args){

        String zooName = "Brookfield Zoo";
        String foundedDate = "July 1, 1934";
        String openingTime = "10am";
        String closingTime = "5pm";
        boolean isOpenOnHolidays= true;
        boolean hasAquariumSection = false;
        int numberOfBigCats = 10;
        int numberOfHoofedAnimals = 60;
        int numberOfReptiles = 120;
        int numberOfBirds = 175;
        int numberOfPrimates = 76;
        int numberOfEmployees = 350;
        double ticketCostForAdults = 24.95;
        double ticketCostForUnder13 = 17.95;
        String parkRules = "You can read all rules on the official website";

        System.out.println("------- "+zooName+" -------");
        System.out.println("The zoo is founded on "+foundedDate+".");
        System.out.println("Operating hours are: "+openingTime+" to "+closingTime);
        System.out.println("Is the zoo open on Holidays? "+isOpenOnHolidays);
        System.out.println("Does the zoo have aquarium section? "+hasAquariumSection);
        System.out.println("The zoo has "+numberOfBigCats+" big cats, "+numberOfHoofedAnimals+" hoofed animals, "+ numberOfReptiles+" reptiles, " +
                numberOfBirds+ " birds, and "+numberOfPrimates+" primates"+".");
        System.out.println(numberOfEmployees+ " employees work at the "+" "+ zooName);
        System.out.println("Ticket price: adults - "+ticketCostForAdults+", children under 13 - "+ticketCostForUnder13);
        System.out.println("Zoo general rules: "+parkRules);

    }
}
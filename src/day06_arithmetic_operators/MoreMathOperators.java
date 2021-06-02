package day06_arithmetic_operators;

public class MoreMathOperators {
    public static void main(String[] args) {
        int toyotas = 431;
        int hondas = 233;
        int vw = 2;
        int tesla = 20;
        int nissan = 1;
        int bmw = 155;
        int totalCarsInParking = toyotas + hondas + vw + tesla + nissan + bmw;// declare add some command you want to printout
        System.out.print("There are " + totalCarsInParking + " cars in the parking lots.\n");
        System.out.println("     \n             ***new command****");
        String pizza = "hawaiian";
        int slice = 8;
        int people = 4;
        int slicePerPerson = slice / people;
        System.out.println();
        System.out.println("There are " + slicePerPerson + " slices per person");
        System.out.println("we ordered " + pizza + " pizza with " +
                slice + " slices for " + people + " people.");
        System.out.println("We ordered " + pizza + " pizza with " + slice + " slices, " //enter for break down to new line
                + people + " people for " + slicePerPerson + " slices each.");

    }
}

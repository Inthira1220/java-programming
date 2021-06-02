package day10_shorthand_operators;

public class ShortHandOperators {
    public static void main(String[] args) {
        int car = 10;
        System.out.println("Car in the parking lot = " + car);
        car = car + 2;     // long write
        System.out.println("Car in the parking lot = " + car);
        car = car += 5;      // short write code
        System.out.println("Car in the parking lot = " + car);

        car = car -= 6;
        System.out.println("Car in the parking lot = " + car);
        car = car -= 1;
        car = car - 1;
        System.out.println("Car in the parking lot = " + car);

        int electricCar = 13;
        car += electricCar;// short write code
        System.out.println("Car in the parking lot = " + car);

        String word = "Java";
        System.out.println("word = " + word);
        word += " programming";
        System.out.println("word = " + word);// short hand =>have to put ""
        word += "is fun!!";
        System.out.println("word = " + word);

        String selenium = " but \"selenium\" is more fun.";
        word += selenium;
        System.out.println("word = " + word );
        word +=12345;
        System.out.println("word = " + word );

        char letter = 'A';
        System.out.println("Letter = "+ letter);
        letter += 3;
        System.out.println("Letter = "+ letter);
        letter += 1 ;
        System.out.println("Letter = "+ letter);

        double parkingFee = 7.50;
        System.out.println("Parking fee= $"+ parkingFee);
        parkingFee /= 2;
        System.out.println("Early Bird Parking Fee= $"+ parkingFee);
        parkingFee -= parkingFee;
        System.out.println("Weekend Parking Fee= $"+ parkingFee);
    }
}
package day34_void_method;

public class StartCheapCar {
    public static void main(String[] args) {
//            seatInCar
//            startTheCar
//            shiftToDrive
//            pressGasPedal
        seatInCar();
        startTheCar();
        shiftToDrive();
        pressGasPedal();


    }

    public static void seatInCar() {
        System.out.println("1) Open the door and seat in driver seat");

    }

    public static void startTheCar() {

        System.out.println("2) insert key to ignition start your car!!");
    }

    public static void shiftToDrive() {

        System.out.println("3) change the transmission to d");
    }

    public static void pressGasPedal() {
        System.out.println("4) hold steering wheel with 2 hand and press the gas pedal and go");
    }

}

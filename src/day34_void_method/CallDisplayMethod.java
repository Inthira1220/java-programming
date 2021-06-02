package day34_void_method;

public class CallDisplayMethod {
    public static void main(String[] args) {
        //classname.methodName
        FirstMethod.displayMessage();

        //try to loop from call FirstMethod.displayMessage();
        for (int i = 1; i < 5; i++) {
            System.out.print(i+ " ");
            FirstMethod.displayMessage();

        }
        System.out.println(" call StartCheapCar ");
        StartCheapCar.seatInCar();
        StartCheapCar.startTheCar();
        StartCheapCar.shiftToDrive();
        StartCheapCar.pressGasPedal();


    }

}

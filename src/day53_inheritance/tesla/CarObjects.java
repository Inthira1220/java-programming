package day53_inheritance.tesla;

public class CarObjects {
    public static void main(String[] args) {

        ElectricCar ec1 = new ElectricCar("Tesla", "Model Y", 48190.0, 2021, 236);
        ec1.drive(50); //Driving 50 miles
        System.out.println(ec1.toString());
        //ElectricCar{make='Tesla', model='Model Y', price=48190.0, year=2021, range=186}
        System.out.println("ec1 make = " + ec1.getMake());
        System.out.println("ec1 Model = " + ec1.getModel());
        System.out.println("ec1 Price = " + ec1.getPrice());
        System.out.println("ec1 Year = " + ec1.getYear());
        System.out.println("ec1 Range = " + ec1.getRange());

        if (ec1.getPrice() > 10000) {
            System.out.println(ec1.getMake() + " " + ec1.getModel() + " is out of budget");
        } else {
            System.out.println("purchasing " + ec1.toString());
        }
        System.out.println(ElectricCar.getCount());     //1

        ElectricCar ec2 = new ElectricCar("Tesla", "Cybertruck", 59990.00, 2022, 300);
        System.out.println("ec2.toString() = " + ec2.toString());
        System.out.println("ElectricCar.getCount() = " + ElectricCar.getCount()); //ElectricCar.getCount() = 2
        System.out.println("ec2.getCount() = " + ec2.getCount()); // call static method using object

        Roadster roadster = new Roadster("Roadster", 200000, 2022, 620);
        System.out.println(roadster.toString()); //ElectricCar{make='Tesla', model='Roadster', price=200000.0, year=2022, range=620}
        roadster.drive(1000);
        roadster.drive(600);
        System.out.println("roadster.getCount() = " + roadster.getCount());

        ModelX myModelX = new ModelX("Tesla", "Model X", 89900.0, 2021, 360);
        System.out.println("myModelX = " + myModelX.toString());
        myModelX.drive(10);
        System.out.println("having lunch...");
        myModelX.drive(10);
        System.out.println("range remaining = " + myModelX.getRange());
        System.out.println("ElectricCar.getCount() = " + ElectricCar.getCount());
    }
}

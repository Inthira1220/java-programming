package day46_encapsulation;

public class DealerShip {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setModel("Honda Accord");
        System.out.println("car1.getModel() = " + car1.getModel());
        car1.setYear(2015);
        System.out.println("car1.getYear() = " + car1.getYear());
        car1.setMileage(50_000);
        System.out.println("car1.getMileage() = " + car1.getMileage());
        System.out.println("car1.toString() = " + car1.toString());
        System.out.println("car1 = " + car1);

        Car alfaRoemo = new Car();
        alfaRoemo.setModel("Alfa Romeo Guilai Ti AWDs");
        alfaRoemo.setYear(2020);
        alfaRoemo.setMileage(16604);
        System.out.println("alfaRoemo.toString() = " + alfaRoemo.toString());
        System.out.println(alfaRoemo);
    }
}

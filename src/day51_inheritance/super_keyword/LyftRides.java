package day51_inheritance.super_keyword;

public class LyftRides {
    public static void main(String[] args) {

        Lyft lyftRide = new Lyft();
        Lyft lyftXLRide = new LyftXL();
        Lyft lukRide = new Lux();

        System.out.println("lyftRide.calculateRate(5) = " + lyftRide.calculateRate(5));
        System.out.println("lyftXLRide.calculateRate(5) = " + lyftXLRide.calculateRate(5));
        System.out.println("lukRide.calculateRate(5) = " + lukRide.calculateRate(5));


    }
}

package day56_abstraction.driveable;

public class DrivableTest {
    public static void main(String[] args) {
        Tesla model3 = new Tesla();
        model3.start();
        model3.hi();
        model3.transportPeople();
        model3.autoPiloting();
        model3.cost(20);
        model3.bye();
        model3.stop();

        Plane bowing747 = new Plane();
        bowing747.land();
        bowing747.start();
        bowing747.hi();
        bowing747.bye();
        bowing747.transportPeople();
        bowing747.autoPiloting();
        bowing747.cost(200);


        SelfDrivable sd = new Plane();
        SelfDrivable sd2 = new Plane();
    }
}

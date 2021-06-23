package day56_abstraction.driveable;

import day56_abstraction.Greeting;


public class Plane extends Transportation implements SelfDrivable, Greeting {
    @Override
    public void hi() {
        System.out.println("get ready to take off");

    }

    @Override
    public void bye() {
        System.out.println("plane is on autopilot");

    }

    @Override
    public void autoPiloting() {
        System.out.println("flying with autopilot mode");
    }

    @Override
    public void transportPeople() {
        System.out.println("fly people to different place");

    }

    @Override
    public void cost(int mile) {
        System.out.println("Plane coses"+ (mile + 25.0) + " to drive " + mile + " miles");

    }

    public void land() {
        System.out.println("buckle up");
    }
}

package day56_abstraction.driveable;

import day56_abstraction.Greeting;

public class Tesla extends Transportation implements SelfDrivable, Greeting {
    @Override
    public void transportPeople() {
        System.out.println("Tesla is transporting people on the road");
    }

    @Override
    public void cost(int mile) {
        System.out.println("Tesla costs " + (mile + 0.01) + " to drive " + mile + "miles");

    }

    @Override
    public void autoPiloting() {
        System.out.println("Tesla is driving on autonomous mode");

    }

    @Override
    public void hi() {
        System.out.println("hello hello peep peep");
    }

    @Override
    public void bye() {
        System.out.println("Shout down the engine");

    }
}

package day55_abstraction.exercise_example;

import day55_abstraction.exercise_example.Exercise;

public class Running extends Exercise {

    @Override
    public void perform() {
        System.out.println("Performing Running exercise");

    }

    @Override
    public int getCaloriesCount(int minutes) {  //param->how long is exercise perform
        return minutes * 13; //return will be sum of minute
    }
}

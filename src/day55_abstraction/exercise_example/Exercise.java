package day55_abstraction.exercise_example;

public abstract class Exercise {

    public void start() { //1st call non-abstract method
        System.out.println("Warming up and starting the exercise");
    }

    //abstract dont need {} method with out body, just signature
    //body means implementation, purpose to let sub classes implement/override their own way
    public abstract void perform();

    public abstract int getCaloriesCount(int minutes); //param - minute for how long exercise perform

}

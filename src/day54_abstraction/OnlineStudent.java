package day54_abstraction;

/**
 * OnlineStudent extend student abstract class
 * this class is considered to be concrete class
 * it is responsible to implement all abstract method (->if any)
 */

public class OnlineStudent extends Student {
    /**
     * attendClass abstract method is implemented by the sub class
     * Sub class is overriding the abstract method of Parent class
     */
    @Override
    public void attendClass() {
        System.out.println("Online student is attending the class using Zoom");
    }

    //public abstract void askQuestion();  =>Error, abstract method cant be in normal class
}

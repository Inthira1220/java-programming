package day45_oop;

public class TrafficLightObject {
    public static void main(String[] args) {
        //crete traffic light object
        TrafficLight trafficLight1 = new TrafficLight();
        trafficLight1.changeColor("red");
        trafficLight1.showColor();


        trafficLight1.changeColor("green");
        trafficLight1.showColor();

        trafficLight1.changeColor("blue");
        trafficLight1.showColor();
    }
}

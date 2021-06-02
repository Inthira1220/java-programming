package day45_oop;

public class TrafficLight {
    //this is the Template class
    String color;
    public void showColor(){ //<--read only method, display value of color variable
        System.out.println("current color = " + color);
    }
    public void changeColor(String newColor){ //<--change method, update method
        if(newColor.equalsIgnoreCase("red")||newColor.equalsIgnoreCase("yellow")||newColor.equalsIgnoreCase("green")){
            System.out.println("Changing color to " + newColor);
            color = newColor;
        }else{
            System.out.println("ERROR: invalid color : " + newColor);
        }
    }
    // then call from TrafficLightObject


}

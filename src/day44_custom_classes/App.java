package day44_custom_classes;

import java.util.Objects;

public class App {
/**
 * App class is used as a template for App objects.
 * We are describing app properties and behaviour here. Objects will be able to use them
 */

    String name; //null by default
    double version; // 0.0 by default
    //Open method is using name and version variables
    public void open() {
        System.out.println("opening " + name +" app - version = " + version);
    }

/**
 * This class is used to create objects of App class
 */

    public static void main(String[] args) {
        //String app1 = "uber"; this is string object. just characters
        App uberApp = new App(); //creating new object
        //opening Uber app - version = 3.5
        uberApp.name = "Uber";
        uberApp.version = 3.5;
        uberApp.open(); //call open method using object variable

        uberApp.version = 4.0;
        uberApp.open(); //open new version

        /**
         * create more objects and practice
         *
         */


    }
}
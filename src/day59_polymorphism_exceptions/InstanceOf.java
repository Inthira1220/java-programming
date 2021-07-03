package day59_polymorphism_exceptions;

import javafx.scene.shape.Circle;
import javafx.scene.shape.Shape;

public class InstanceOf {
    public static void main(String[] args) {
        //instance of operator
        Shape shape = new Circle();
        System.out.println(shape instanceof Circle);

        }
}

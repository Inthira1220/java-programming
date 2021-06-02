package OfficeHours_Saim_Practice_03_08_2021;
import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double length = input.nextDouble();
        double width = input.nextDouble();

        double perimeter = 2 * (length + width);
        double are = length * width;
        System.out.println("perimeter = " + perimeter);

    }

}
/*
Make a class Rectangle
create a main method

     - Declare two variables: length and width

         - Calculate the Perimeter 2(l*w)
         - Calculate the Area (w * l)

     - Print properties of the Rectangle

     - Modify to accept Scanner inputs
 */
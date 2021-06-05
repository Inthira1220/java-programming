package day08_casting_scanner;

public class CastingExamples {
    public static void main(String[] args) {
        //byte - short - int - long
        byte num1 = 100;
        short num2 = num1;
        int num3 = num1;
        int num4 = 1000;
        long num5 = num4;
        float num6 = 124.4F;
        double num7 = num6;
        int num8 = 3456;
        double num9 = num8;
        System.out.println(num8);//3456
        System.out.println("num9 = " + num9);//3456.0
        System.out.println("- - -- - -- - - - - -  - -");
        int num10 = 22;
        byte num11 = (byte)num10;//cast it!!
        short num12 = (short)num10;
        System.out.println("num10 = " + num10);//22
        System.out.println("num11 = " + num11);//22
        System.out.println("num12 = " + num12);//22
        double num13 = 55.3;
        float num14 = (float)num13;
        System.out.println("num13 = " + num13);//55.3
        System.out.println("num14 = " + num14);//55.3
        double num15 = 12345.5;
        int num16 = (int)num15;
        System.out.println("num15 = " + num15);//12345.5
        System.out.println("num16 = " + num16);//12345
        int num17 = 300;
        byte num18 = (byte)num17;
        System.out.println("num17 = " + num17);//300
        System.out.println("num18 = " + num18);//44 get the remainder 300-127+127=4

        char letter = 'I';
        int numLetter = letter;
        System.out.println("numLetter = " + numLetter);

    }
}
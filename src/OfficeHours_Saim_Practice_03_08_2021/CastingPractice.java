package OfficeHours_Saim_Practice_03_08_2021;

public class CastingPractice {
    public static void main(String[] args) {
        //byte->short->int->long->float->double
        byte b = 10;
        short s = b;
        byte b2 = (byte)s;// casting down to byte

        double d =5.3;
        int i =(int)d;
        System.out.println(i);//5
        System.out.println((double)i);

        float f = 3.54f;//System sees as an int it have to put f behind 3
        float f2 = (float)3.54;//float = (float)double

        float f3 = 5; // float = int ->5
        float f4 = 5.5F;// float = double

        long l1 = 22313; // long = int
        long l2 = 31231233323L;//when it print out, it will come out without l
        //long l3 = (long)31231233323; doesnt work bcaz the number is too big to casting

        System.out.println(l1);
        System.out.println();
        System.out.println((double)l1);
        System.out.println((float)l1);
        System.out.println(l2);

        double million = 1_000_000;// _ make it readable!! easy to recognized
        System.out.println(million);

    }
}

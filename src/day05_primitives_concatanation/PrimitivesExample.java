package day05_primitives_concatanation;

public class PrimitivesExample {
    public static void main(String[] args){
        byte byteValue = 127;// -128-(+127)
        System.out.println(byteValue);
        byteValue = -128;// -128-(+127) = 127;// -128-(+127)
        System.out.println(byteValue);
        short shortValue = -32768;
        System.out.println(shortValue);
        int intValue = (1000000000);
        System.out.println(intValue);
        long longValue = 1234567891L;// long value hv to add L in the end
        System.out.println(longValue);
        float floatValue = 1000000000F; //f,F doesnt matter
        System.out.println(floatValue);
        double doubleValue = 1.123;// d,D after, you dont have too caz double recognize code already
        System.out.println(doubleValue);
        char charValue = 'A';// only 1 character
        System.out.println(charValue);
        boolean booleanValue = true;// true or false only***
        System.out.println(booleanValue);
        System.out.println(byteValue + "\n"+ intValue + "\n"+ shortValue +
                "\n"+ floatValue + "\n"+ doubleValue + "\n"+ charValue + "\n"+ booleanValue);//print out together

    }
}

package day05_primitives_concatanation;

public class CellPhone {
    public static void main(String[] args){
        String brand = "Apple";
        String model = "iPhoneX Plus";
        String color = "Grey";
        double price = 699.99;
        String storage = "256GB";
        boolean hasCamera = true;
        System.out.println(brand);
        System.out.println(model);
        System.out.println(color);
        System.out.println(price);
        System.out.println(storage);
        System.out.println(hasCamera);
        System.out.println(brand+"\t"+model+"\t"+color+"\t"+price+"\t"+storage+"\t"+hasCamera);
        System.out.println("Brand is "+brand);
        System.out.println("Model is "+model);
        System.out.println("Color is "+color);
        System.out.println("The Brand name is "+ brand +"\n" + "The Model name is "+ model+"\n"+ "The color of the phone is "+color );
        System.out.println("Has camera? ->"+ hasCamera);

    }
}


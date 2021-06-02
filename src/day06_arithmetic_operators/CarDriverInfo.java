package day06_arithmetic_operators;

public class CarDriverInfo {
    public static void main(String[] args){
        String carModel = "Honda";
        String driverName = ("Inthira");
        int licenseNum = 12345;
        double speed = 120;
        char licenceClass = 'A';
        boolean isAutomatic = true;
        System.out.println("Car Model: "+"\t\t"+carModel+".");
        System.out.println("Driver's name: "+"\t"+driverName+"\n"+"License number: "+licenseNum+".");
        System.out.println("Speed Car: "+"\t\t"+speed+" mph. ");
        System.out.println("Driver Class:"+"\t"+licenceClass);
        System.out.println("Automatic:" +"\t\t"+isAutomatic);
        System.out.println();
        System.out.println (driverName + " is driving " + carModel+".");
    }

}

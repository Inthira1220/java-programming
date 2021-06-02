package OfficeHours_Saim_Practice_03_02_2021;

public class Computer {
    public static void main(String[] arg){
        String brand = "Microsoft";
        double processor = 8;
        double storageMemory = 256;
        char hasMonitor = 'Y';
        char hasWifiCard = 'Y';
        String description = "Intel HD Graphic 620(i5)";
        double price = 1999;
        char cpu = 'Y';
        String color = "gold";
        int numberOfMonitors = 3;
        int numberOfUsbSlot = 4;
        boolean hasUsb3 = true;
        System.out.println("===>Computer Detail<==");
        System.out.println("Computer Brand:\t"+ brand);
        System.out.println("==>Computer Detail<==\n"+ "Processor: " + processor+ " GB"+"\nMemory Storage: "
                + storageMemory + " GB" + " and "+ description );
        System.out.println("Price:"+ price+ "$");
        System.out.println("Color: " + color);
        System.out.println("Number of Monitor and USB Slot: " + numberOfMonitors+","+numberOfUsbSlot);
        System.out.println("USB3:" + hasUsb3);
    }
}
/*
Create a class named Computer
create a main method

    - Create variables with most appropriate datatypes:

        - brand, processor, ram memory, storage memory, has monitor,
        has wifi card, description, price, cpu, color, number of monitors,
        number of usb slots, has usb 3.0

        - Print out all the variables and values of the computer
 */

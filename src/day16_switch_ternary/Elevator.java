package day16_switch_ternary;

public class Elevator {
    public static void main(String[] args) {
        int floorNum = 7;
        if (floorNum == 1) {
            System.out.println("Floor 1 select. company: Lobby, verizon, Starbucks");
        } else if (floorNum == 2) {
            System.out.println("Floor 2 selected. Companies: Cybertek, NASA, Intelsat");
        } else if (floorNum == 3) {
            System.out.println("Floor 3 selected. Companies: Lyft, BofA, Stake house");
        } else {
            System.out.println("Invalid floor -"+ floorNum);
        }
    }
}

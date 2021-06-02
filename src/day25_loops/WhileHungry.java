package day25_loops;

public class WhileHungry {
    public static void main(String[] args) {
        int bananas = 0;
        boolean isHungry = true;
        int countToFull = 3;

        while (isHungry) {
            bananas++;
            System.out.println("eating bananas: " + bananas);
            if (bananas == countToFull) {
                isHungry = false;
            }

        }
        System.out.println("Had enough bananas. Lets go back to java");
    }
}


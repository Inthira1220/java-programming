package day29_nestedloop_array;

public class LoopWithContinue {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            if(i % 2!=0){
                continue;
            }
            System.out.println("even Number" + i);
        }
    }
}


package ReplitLoops;

import java.util.*;

public class quiz {
    public static void main(String[] args) {
        String str = "the whole time it was raining.";
        do {
            System.out.print(str.charAt(0));
            str = str.substring(3);
        }while(!str.isEmpty());
    }
}




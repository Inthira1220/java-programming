package aaReplit_7_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class SizeAndGet {
    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        //int size = in.nextInt();
        int size = 5;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            //list.add(in.nextInt());
            list.add(5);
            //System.out.println(list);

        }
        System.out.println(list);
        int sum = 0;
        for(int i=0; i<list.size();i++){
            sum+=list.get(i);
        }
        System.out.println(sum);

    }

}

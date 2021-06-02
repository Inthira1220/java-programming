package day27_loops;

public class ReadStringPortion {
    public static void main(String[] args) {

        String list = "cat,car,cat,red_car,java,selenium";
        //using substring print first 3 letter
        //int i = 0; <----change number to i
//        System.out.println(list.substring(0));        //cat,car,cat,red_car,java,selenium
//        System.out.println(list.substring(0, 3));     //cat
        // i++; --->1                       (i, i+3)
//        System.out.println(list.substring(1, 4));     //at
        //i++; --->2                        (i, i+3)
//        System.out.println(list.substring(2, 5));     //t,c
//        System.out.println(list.substring(3, 6));     //,ca
//        System.out.println(list.substring(4, 7));     //car


        for(int i = 0; i < list.length()-2; i++){ //<----length will take out 2 letter last
            System.out.println(list.substring(i , i+3));
        }
    }
}

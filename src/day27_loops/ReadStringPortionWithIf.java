package day27_loops;

public class ReadStringPortionWithIf {
    public static void main(String[] args) {

        String list = "cat,car,cat,red_car";
        for (int i = 0; i < list.length() - 2; i++) { //<----length will take out 2 letter last
            //Slistring part = list.substring(i, i + 3);
            System.out.println(list.substring(i, i + 3));
            if (list.substring(i,i+3).equals("cat")||list.substring(i,i+3).equals("car")){
                System.out.println("cat or car");
            }
        }

    }
}

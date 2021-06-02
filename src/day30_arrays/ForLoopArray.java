package day30_arrays;

public class ForLoopArray {
    public static void main(String[] args) {
        int[] data = {55, 66, 555, 8, 99, 77, 10, 40, 100, 1000};
        for (int eachNum : data) {
            System.out.println(eachNum);
        }
        for (int n : data) {
            System.out.print(n + " ");
            //55 66 555 8 99 77 10 40 100 1000


        }
        System.out.println("---------------------for loop------");
        //repeat above with for loop
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
        //print last value in array, index using length-1
        //System.out.println(data.length-1);//<-----------X careful its wrong
        // index 10 = 10 -1 = 9 became length
        System.out.println("Last Index : " + data[data.length - 1]); //<----------its right

        //repeat even other
        for (int i = 0; i < data.length; i += 2) { //<-----repeat even other
            System.out.println("every other one : " + data[i] + " ");
        }
        System.out.println("------------------------------------------------------------");
        //print all number backwards in same line
        for (int idx = data.length-1; idx >=0; idx--) { //<------go back have to do minus minus
            System.out.print(data[idx]+ " ");

        }
    }
}

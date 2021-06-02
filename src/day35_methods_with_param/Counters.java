package day35_methods_with_param;

public class Counters {
    public static void main(String[] args) {
        count(5);
        count(6);
        int num2 = 15;
        count(num2);

        String word = "wooden spoon";
        count(word.length());   //get the size of the word
                                //print index from 0,1,2,3...12
        printAge(1977);
        printAge(1988);
        int years = 2000; //<--assign variable
        printAge(years); //Birth year: 2000 ,age: 21 years old.

    }
    public static void count(int num){
        for (int i = 0; i <= num; i++) {
            System.out.print(i+ (" "));

        }
        System.out.println(" ");
    }
    public static void printAge(int year){
        int age = 2021-year;
        System.out.println("Birth year: "+ year + " ,age: " +age+ " years old.");
    }
}

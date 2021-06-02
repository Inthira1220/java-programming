package day45_oop;

public class comparingString {
    public static void main(String[] args) {
        String word1 = "java"; //<--string pool
        String word2 = "java"; //<--re-use from string pool
        String word3 = new String("java"); //<--created New object in the heap outside the pool
        String word4 = new String("java"); //<--created New object in the heap outside the pool

        System.out.println(word1==word2);  //TRUE -  point to same object in pool
        System.out.println(word1==word3);  //FALSE -> point to different object in HEAP and POOL
        System.out.println(word3==word4);  // FALSE -> point to different objects in HEAP

        System.out.println(word1.equals(word2)); //true -  compare with the variable
        System.out.println(word1.equals(word3)); //true -  compare with the variable
        System.out.println(word3.equals(word4)); //true -  compare with the variable

    }
}

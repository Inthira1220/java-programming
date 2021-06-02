package day31_arrays;

import java.util.*; //change from Array to *

public class ArraysUtilWithString {
    public static void main(String[] args) {
        String[] words = {"Java", "C#", "C++", "Kotlin", "Python", "Ruby", "assembly"};
        System.out.println(Arrays.toString(words)); //[Java, C#, C++, Kotlin, Python, Ruby, assembly]
        System.out.println("["+String.join(", ", words)+"]");//[Java, C#, C++, Kotlin, Python, Ruby, assembly]

        //sort words in alphabetic and ASCII order
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));//[C#, C++, Java, Kotlin, Python, Ruby, assembly]

        //sort words in reverse order
        Arrays.sort(words, Collections.reverseOrder());

        System.out.println(Arrays.toString(words)); //[assembly, Ruby, Python, Kotlin, Java, C++, C#]


        //this one will work after i change (Array) to util.*
        String[] languages = {"Java", "Python", "c++", "sql", "ruby", "javascript"};
        Arrays.sort(languages, Collections.reverseOrder());
        System.out.println(Arrays.toString(languages)); //[sql, ruby, javascript, c++, Python, Java]
    }
}

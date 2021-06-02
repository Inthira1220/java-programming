package day32_arrays_split;

import java.util.*;

public class CountUsingSplit {
    public static void main(String[] args) {
        String catType = "bengal cat tabby cat persian cat no cat here";
        String[] catsArray = catType.split(" cat ");
        System.out.println(Arrays.toString(catsArray));
        System.out.println("Length of Array =  " + catsArray.length);


        int count = 0;
        for(int i = 0; i < catsArray.length; i++){
            if(catsArray[i].equalsIgnoreCase("cat")){
                count++;
            }
        }
        System.out.println("There are " + count + " cats");


    }
}

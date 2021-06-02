package day41_arraylist;

import java.util.ArrayList;

public class citiesList {
    public static void main(String[] args) {
        ArrayList<String> city = new ArrayList<>();
        //add city  to arrayList
        city.add("DC");
        city.add("New York");
        city.add("Vienna");
        city.add("Adana");
        city.add("LA");
        System.out.println("city = " + city); //city = [DC, New York, Vienna, Adana, LA]
        System.out.println(city.size()); //5
        
        //add Ashabat to thr first index
        city.add(0, "Ashgabat");
        System.out.println("city = " + city); //city = [Ashgabat, DC, New York, Vienna, Adana, LA]
        
        //print 1st and last city
        System.out.println(city.get(0)+ ", "+city.get((city.size()-1)));
        
        //print out items or in store to variable for multiple user
        System.out.println("city.size() = " + city.size());
        int citySize = city.size();
        System.out.println("citySize = " + citySize);

        // for loop and print all values in same line
        for (int i = 0; i < citySize; i++) {

            System.out.println(city.get(i) + " ");

        }

        System.out.println("----");

        //for each loop
        for (String each:city) {
            System.out.print(city+ " ");
        }
        System.out.println();
        System.out.println("***************************************");
        //remove - delete item from arrayList
        //1) remove using index/ delete value at index 3
        city.remove(3);
        System.out.println(city);
        System.out.println("***************************************");
        //2) remove using object/value
        city.remove("New York");
        System.out.println("city = " + city);

        //3) remove all
        //3.1) clear
        city.clear();
        System.out.println("using clear ==>list is empty : "+city);

        //3.2) using isEmpty
        if(city.isEmpty()){
            System.out.println("using isEmpty ==>list is empty = "+ city);
        }
        //3.3) check size
        if(city.size()==0){
            System.out.println("check size ==>list is empty = " + city);
        }

   }


}

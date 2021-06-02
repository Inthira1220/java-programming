package day19_class_vs_object_string;

public class StringComparison {
    public static void main(String[] args) {
        String city = "New York";

        System.out.println(city.equals("New York"));
        System.out.println(city.equals("new york"));//false
        System.out.println(city.equalsIgnoreCase("New york"));
        System.out.println(city.equalsIgnoreCase("New York"));

        if(city.equals("New York")) {
            System.out.println("equals() true");
        }else{
            System.out.println("equals() false");
        }
        if (city.equalsIgnoreCase("New York")) {
            System.out.println("equalsIgnoreCase() true");
        }else{
            System.out.println("equalsIgnoreCase() false");
        }
    }
}

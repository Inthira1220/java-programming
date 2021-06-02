package day19_class_vs_object_string;

public class CheckCaseMatch {
    public static void main(String[] args) {
        String country = "tha";
        country = country.toUpperCase();

        if( country.equals(country.toUpperCase())) {
            System.out.println("PASS - case is correct! "+ country.toUpperCase());
        }else{
            System.out.println("Fail - case is Incorrect!");
        }
    }
}

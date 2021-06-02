package day14_multi_branch_if_statements;

public class IfWithOutElse {
    public static void main(String[] args) {
        System.out.println("");
        int year = 2025;  // if put 2020
        if (year ==  2021) { // and this line same number on line 6 like int = 2021, result is true and print out
            System.out.println(year);
            System.out.println("Wear mask and keep 6 feet distance");
        }
        System.out.println("Keep coding JaVa" );
        System.out.println("");
        System.out.println("");
        String country = "USA";
        if (country.equals ("USA")){
            System.out.println("Washington DC is the Capital");
            System.out.println("White house is on Pennsylvania ave");
        }
        System.out.println("Welcome to "+ country);
    }
}

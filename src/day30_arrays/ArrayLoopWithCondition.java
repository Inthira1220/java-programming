package day30_arrays;

public class ArrayLoopWithCondition {
    public static void main(String[] args) {
        double[] prices = {22.9, 12.4, 43.12, 65.0, 100.4, 543.23, 98.32, 533.43, 34.23, 124.9, 234.23};
        String[] countries = {"Brazil", "China", "Cuba", "Sweden", "France", "Vietnam", "Albania", "Brazil",
                "Portugal", "China", "Philippines", "Philippines", "China", "Philippines", "China", "Armenia",
                "Philippines", "China", "Colombia", "Philippines", "Honduras", "Indonesia", "Brazil", "China",
                "United States", "Russia"};
        //print all numbers from prices array that are more than 100
        System.out.println("----Prices less than 100------");
        for (double eachPrices : prices)
            if (eachPrices > 100) {
                System.out.print(eachPrices + ", ");
            }
        System.out.println("\n-----prices between 10 and 70------");
        for (double eachPrices1 : prices)
            if (eachPrices1 >= 10 && eachPrices1 <= 70) {
                System.out.print(eachPrices1 + ", ");
            }
        System.out.println("\n-----count of the prices that are more than 50");
        int count =0 ;
        for(double each : prices){

            if(each>=50){
                count++;
                System.out.print(each+", "); //<------check prices
            }
        }
        System.out.println("\ncount = "+ count); //count = 7<------check จำนวน
        System.out.println("coutries with name lenght more than 7 -inclusive---- ");

        for (String name : countries){
            if (name.length() >= 7){
                System.out.println(name+ " - "+ name.length()+ "");
            }

        }
    }
}

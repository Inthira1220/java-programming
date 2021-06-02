package day15_logicallops_switch_ternary;

public class CitySelection {
    public static void main(String[] args) {
        String city = "Moscow";
        //Moscow or Tampa
        if (city.equals("Moscow") || city.equals("Tampa")){
            System.out.println("Willing to relocate to " + city);
        }else{
            System.out.println("Not considering - " + city);
        }
        System.out.println();
        String teacher = "Murodil";

        if (teacher.equals("Saim") || teacher.equals("Murodil")){
            System.out.println("it is a java class with - " + teacher);

        }else{
            System.out.println("Soft skill class with " + teacher);
        }if (teacher.equals("Saim") || teacher.equals("Murodil") ) {
            System.out.println("java class with " + teacher);
        }else if (teacher.equals("Nadir")){
            System.out.println("Soft skill class with" + teacher);

        }else{
            System.out.println("Some other class with " + teacher);
        }
        System.out.println("----------------------------------");
        System.out.println();

        String company = "Google"; //offer either offer
        double salary = 100_000;
        if (company.equals("Google") || salary>=100_000) {
            System.out.println("Accept this offer \"" + company + "\" with salary $"+ salary);
        }else{
            System.out.println("No, Thank you for your time");
        }
    }
}

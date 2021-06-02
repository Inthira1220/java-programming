package day15_logicallops_switch_ternary;

public class JobOfferSelector {
    public static void main(String[] args) {
        String location = "DMV";
        double salary = 100_000;
        boolean isRemote = true;
        boolean isBenefit = true;

        if(location.equals("DMV") && salary >= 100_000 && isRemote && isBenefit) {
            System.out.println("I will accept this job offer in "+ location + " with remoting and benefit.");
        }else{
            System.out.println("lets consider another off or negotiate.");
        }
    }
}


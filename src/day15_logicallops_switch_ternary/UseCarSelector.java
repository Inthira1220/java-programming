package day15_logicallops_switch_ternary;

public class UseCarSelector {
    public static void main(String[] args) {
        double budget = 5000;
        String model = "Toyota"; // toyota, honda, tesla
        double carPrice = 5500;

        if (carPrice <= budget && (model.equals("Toyota") || model.equals("Honda") || model.equals("Honda"))){
            System.out.println("Ready to purchase = " + model +" model: $" + carPrice);
        }else{
            System.out.println("need to find the different car that you can afford! " + model + ". Your budget is $" + budget);
        }


    }
}

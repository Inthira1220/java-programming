package day15_logicallops_switch_ternary;

public class NotLogicalOperator {
    public static void main(String[] args) {
        System.out.println("!true =" + (!true));
        System.out.println("!false =" + (!false));

        System.out.println("************************");
        int age = 8;
        if (!(age >= 7)) {
            System.out.println("Need to sit in the child car seat = " + age);
        } else {
            System.out.println("no child seat needed = you are " + age + " years old!");
        }
        System.out.println("************************");
        boolean isSmokingAllowed = false;
        if (!isSmokingAllowed) {
            System.out.println("Smoking is now allow here!! Exit");
        }
        System.out.println("************************");
        boolean isAffordable = true;
        if (!isAffordable) {
            System.out.println("Item Not affordable!!");//false
        }
        System.out.println("************************");
        String env = "qa";
        if (!(env.equals("qa"))) {
            System.out.println("In wrong environment for QA testing"); // result is true
        }
        String carModel = "Tesla";
        if (!(carModel.equals("Tesla"))) {
            System.out.println("is its not Tesla, print = No interested, Thank you");
        }
        String secretPwd = "abc123";
        String inputPwd = "abc321";
        if(!inputPwd.equals("abc123")){
            System.out.println("Incorrect Password");
        }
    }
}

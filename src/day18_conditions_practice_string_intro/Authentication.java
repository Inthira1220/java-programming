package day18_conditions_practice_string_intro;

public class Authentication {
    public static void main(String[] args) {

        int last4ssn = 1234;
        int pinCode = 4321;

        int expLast4ssn = 1234;
        int expPinCode = 4322;


        if (last4ssn == pinCode && expLast4ssn == expPinCode) {
            System.out.println("Authentication successful");
        } else {
            System.out.println("Authentication Unsuccessful");
            if (last4ssn != expLast4ssn) {
                System.out.println("Last 4 ssn is Incorrect!");
            }
            if (expPinCode != pinCode) {
                System.out.println("Pin Code is incorrect!");
            }
        }
    }
}

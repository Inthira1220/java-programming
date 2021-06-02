package day13_conditional_statemants;
import java.util.Scanner;
public class ATMPincodeProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("****Welcome TO TD BANK ATM *****");
        int secretPinCode = 1234;
        int inputPinCode = scan.nextInt();
        if(secretPinCode == inputPinCode){
            System.out.println("  ****welcome to your account ****\nYou can withdraw, check balance and deposit ");
        }else{
        System.out.println("Incorrect pincode! " +inputPinCode+ "\nPlease try again." );
        System.out.println("call 911 i need help ");}
        System.out.println();
        System.out.println("  ****Thank you for using TD Bank ATM!****");
    }
}
/*
package day13_conditional_statements
add new class ATMPincodeProgram
main method
print "**** WELCOME TO TD BANK ATM ****"
secretPincode => ****
inputPincode => ****

if condition checks if secretPincode equals inputPincode
    true:
        "Welcome to your account."
        "You can withdraw, check balance, deposit"
    false:
        "Incorrect pincode! 1234"
        "Please try again."


print "Thank you for using TD Bank ATM!"
 */
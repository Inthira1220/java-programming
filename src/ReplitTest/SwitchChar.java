package ReplitTest;

//import java.util.Scanner;
public class SwitchChar {
    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
        char response = 'y';       //scan.next().charAt(0);
        char response2 = 'n';       //scan.next().charAt(0);
        char response3 = 'h';       //scan.next().charAt(0);
        switch (response) {
            case 'y':
                System.out.println("Your request is being processed is printed");
                break;
            case 'n':
                System.out.println("Thank you anyway for your consideration is printed");
                break;
            case 'h':
                System.out.println("Sorry, no help is currently available");
                break;
            default:
                System.out.println("Invalid entry, please try again!");
                break;

        }


    }
}


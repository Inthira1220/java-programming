package ReplitString;

public class email2 {
    public static void main(String[] args) {
        /**
         * Write a program that will print out information about user based on email.
         * Print first name, last name, and domain. First and Last name should be
         * printed with proper format - uppercase first letter and remaining lowercase.
         *  Output:
         * First name: Craig
         * Last name: Federighi
         * Domain: apple
         */
        String email = "craig_federighi@apple.com";

        int underscoreIndex = email.indexOf("_");
        int atSignIndex = email.indexOf("@");
        int dotIndex = email.indexOf(".");


        String firstName = email.substring(0, underscoreIndex);
        firstName = firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();
        String lastName = email.substring(underscoreIndex+1,atSignIndex);
        lastName = lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();
        String domain = email.substring(atSignIndex+1, dotIndex);

        System.out.println("First name: "+firstName);
        System.out.println("Last name: "+lastName);
        System.out.println("Domain: "+domain);

    }
}

package ReplitString;

public class email1 {
    public static void main(String[] args) {
        /**
         * Swap first name with last name in the email (Seperated by an underscore).
         * If the email doesn't contain an underscore print the given input email.
         *
         * Examples:
         *
         * input: mike_tyson@gmail.com
         *
         * output: tyson_mike@gmail.com
         */

        String email = "mike_tyson@gmail.com";

        if (!email.contains("_")) {
            System.out.println(email);
        } else {
            //mike_tyson@gmail.com

        int underscoreIndex = email.indexOf("_");
        int atSignIndex = email.indexOf("@");
        //System.out.println(atSignIndex);
        String firstName = email.substring(0, underscoreIndex);
        String lastName = email.substring(underscoreIndex + 1, atSignIndex);
        //System.out.println(firstName);
        //System.out.println(lastName);
        System.out.println(lastName+"_"+firstName+"@gmail.com");


    }
}
}

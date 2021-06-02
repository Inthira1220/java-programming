package ReplitString;

public class Alejandro {
    public static void main(String[] args) {
        /**
         * Alejandro has many emails and only has time to read the emails that refer to him.
         * Check if his name is found in the email and if it does print "read",
         * but if his name is not in the email print "don't read"
         *
         * Examples:
         *
         * a = "dear alejandro.....alot of text"
         *
         * output: "read"
         */
        String a = "Alejandro";
        if (a.equals("Alejandro")){
            System.out.println("read");

        }else{
            System.out.println("don't read");
        }

    }
}

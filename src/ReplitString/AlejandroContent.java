package ReplitString;

public class AlejandroContent {
    public static void main(String[] args) {
        /**
         * Alejandro has many emails and only has time to read the emails that refer to
         * him and a project. Check if his name is found in the email and if project
         * is also included and if it does print "read", but if his name is not in the email print "don't read"
         *
         * Example:
         *
         * a = "dear alejandro.....alot of text"
         *
         * output: "don't read"
         */
        String a = "";
        if (a.contains("dear alejandro.....alot of text") && a.contains
                ("subject : important project, alejandro we refer to you  this ....")){
            System.out.println("read");

        }else{
            System.out.println("don't read");
        }
    }
}

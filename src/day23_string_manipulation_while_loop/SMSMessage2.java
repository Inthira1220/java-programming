package day23_string_manipulation_while_loop;

public class SMSMessage2 {
    public static void main(String[] args) {
        String message = "Sender: [ Nadir ] From Number<222-333444> Message:{Hello, lets code some java}";

        String sender, mobile, text;

        int name1 = message.indexOf("[") + 1;
        int name2 = message.indexOf("]");
        int mobile1 = message.indexOf("<") + 1;
        int mobile2 = message.indexOf(">");
        //int text1 = message.indexOf("{")+1;
        // int text2 = message.indexOf("}");

//        System.out.println(message.substring(name1, name2));
//        System.out.println(message.substring(mobile1, mobile2));
//        System.out.println(message.substring(text1, text2));
        sender = message.substring(name1, name2).trim(); // put .trim() <== space will take off front front and back of word
        mobile = message.substring(mobile1, mobile2);
        //text = message.substring(text1, text2);
        System.out.println("sender: " + sender);
        System.out.println("Mobile: " + mobile);
        text = message.substring(message.indexOf("{") + 1, message.indexOf("}")); //short than my codes
        System.out.println("text: " + text);

        sender = sender.trim();

        if (sender.equals("Nadir")) {
            System.out.println("message from Saim about homework!");
        } else {
            System.out.println("someone else message");
        }
    }
}


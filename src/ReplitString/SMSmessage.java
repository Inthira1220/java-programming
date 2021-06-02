package ReplitString;

public class SMSmessage {
    public static void main(String[] args) {
        /**
         * Given a String message in the following format:
         * Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}
         * assign the value of the sender, phoneNumber, and messageBody variables and print them.
         *
         * Sender: Mike Smith
         * Phone Number: 202-123-3456
         * Message body: I love programing and problem solving
         */
        String message = "<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}";
        String sender, phoneNumber, messageBody;

        int senderIndex1 = message.indexOf("<") + 1;
        int senderIndex2 = message.indexOf(">");
        int phoneNumber1 = message.indexOf("[")+1;
        int phoneNumber2 = message.indexOf("]");
        int message1 = message.indexOf("{")+1;
        int message2 = message.indexOf("}");

        System.out.println("Sender: " + message.substring(senderIndex1, senderIndex2));
        System.out.println("Phone Number: " + message.substring(phoneNumber1,phoneNumber2));
        System.out.println("Message body:" + message.substring(message1, message2));



    }
}

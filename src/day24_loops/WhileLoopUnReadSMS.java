package day24_loops;

public class WhileLoopUnReadSMS {
    public static void main(String[] args) {
        int unreadSMS = 10;
        System.out.println("i have total "+unreadSMS+" unread SMS");


        while (unreadSMS > 0){   // ---> = or not it only lightly change in the result
           int remainSMS = unreadSMS - 1; //<-----  -1 bcaz of int
            System.out.println("Reading SMS : " + unreadSMS); //<---minus by 1

            unreadSMS--;
        }
        System.out.println("no more message");
    }
}

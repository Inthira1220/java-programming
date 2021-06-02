package ReplitTest;

public class myTryTime {
    public static void main(String[] args) {

    int time = 22; // ถ้าเปลี่ยนตรงนี้เป็น14 จะ ปริ้นออกมาเป็น Good day
    if (time<10){
        System.out.println("Good morning.");}
        else if (time<20){
        System.out.println("Good Day.");} else{
        System.out.println("Good evening.");
    }
    }
}
/*
time(22) is greater than 10, so the first condition is false.
The next condition, in the else id statement, is also false,
so we move on to the else since condition 1 and condition 2 is both false
- and print the screen "Good eventing."
 */
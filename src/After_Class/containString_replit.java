package After_Class;
import java.util.Scanner;
public class containString_replit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       String s = scan.nextLine();
       String a = scan.nextLine();


        if (a.contains("dear alejandro.....alot of text") || a.contains("subject : important project, alejandro we refer to you  this ....")){

            System.out.println("read");
        }else{
            System.out.println("don't read");
       }

    }
}

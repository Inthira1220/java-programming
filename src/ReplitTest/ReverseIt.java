package ReplitTest;

public class ReverseIt {
    public static void main(String[] args) {
        String name = "keada";


        if (name.length() < 5) {
            System.out.println("Too short!");
        } else if (name.length() > 5) {
            System.out.println("Too long!");
        } else if(name.length() == 5){
            name = name.charAt(4) +""+name.charAt(3) +name.charAt(2) +""+name.charAt(1)+""+name.charAt(0);

            System.out.println(name);


        }
    }
}
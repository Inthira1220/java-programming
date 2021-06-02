package day19_class_vs_object_string;

public class IfPassword {
    public static void main(String[] args) {
        String password = "abc1234";
        int passLenght = password.length();

        if (password.length() >= 6){
            System.out.println("Valid password");
    }else{
            System.out.println("Invalid");
        }

    }
}

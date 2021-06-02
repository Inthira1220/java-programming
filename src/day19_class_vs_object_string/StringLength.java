package day19_class_vs_object_string;

public class StringLength {
    public static void main(String[] args) {
        String word = "Java";
        System.out.println(word.length()); //4

        String name = "Inthira";
        int num1 = 1;
        System.out.println("name.length() = " + name.length());// include  1 space is 1 length
        System.out.println(name.toUpperCase() + " has " + name.length() + " characters.");
        System.out.println("count+1 : " + name.length() + num1);
// copy from classmate and run
        String password = "Abc12";
        if (password.length() >= 6) {
            System.out.println("password is correct length = " + password);
        } else {
            System.out.println("Incorrect length of the password");
        }
        int count = name.length();
        System.out.println("count = " + count);
    }
}



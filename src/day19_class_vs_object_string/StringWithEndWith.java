package day19_class_vs_object_string;

public class StringWithEndWith {

    public static void main(String[] args) {
        String url = "http://Inthira.edu";

        if (url.endsWith(".com")) {
            System.out.println("it is commercial website.");
        } else if (url.endsWith(".ru")) {
            System.out.println("it is Russian website.");
        } else if (url.endsWith(".gov")) {
            System.out.println("it is government website");
        } else if (url.endsWith("edu")) {
            System.out.println("It is education website");
        } else if (url.endsWith("org")) {
            System.out.println("It is organize website");
        } else {
            System.out.println("google it more");
        }
    }

}

package day40b_reviewClass;

public class MergeString {
    public static void main(String[] args) {


        String a = "Cybertek";
        String b = "Java";

        String newStr = "";

        if (a.length() >= b.length()) {

            for (int i = 0; i < b.length(); i++) {
                newStr += "" + a.charAt(i) + b.charAt(i);
            }
            int l = a.length() - b.length();
            System.out.println(newStr + a.substring(l));
        }
    }
}

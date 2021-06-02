package day38_methods;

public class StringUtils {
    public static void main(String[] args) {
        System.out.println("isNullIsEmpty(\'Hello\' = ) " + isNullOrEmpty("Hello"));
        String word = null;
        System.out.println("isNullIsEmpty(\'null\' = ) " + isNullOrEmpty(word));
    }

    public static boolean isNullOrEmpty(String str) {
        //return (str == null || str.isEmpty());
        if (str == null || str.isEmpty()) {
            return true;
        }
        return false;
    }

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static String reverse(String word) {
        String revers = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            revers += "" + word.charAt(i);
        }

        return revers;
    }
}

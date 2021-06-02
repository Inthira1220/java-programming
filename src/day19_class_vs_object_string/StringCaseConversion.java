package day19_class_vs_object_string;



public class StringCaseConversion {
    public static void main(String[] args) {
        String word = "Java";
        System.out.println(word.toUpperCase());
        System.out.println(word.toLowerCase());

        word = "CyberTek";
        System.out.println(word.toUpperCase());
        System.out.println(word.toLowerCase());

        word = "Intira";
        word = word.toLowerCase();
        System.out.println("word in lowercase = "+ word);
        System.out.println("word in Uppercase = " +word.toUpperCase());
        System.out.println("Intira".toLowerCase());
        System.out.println("word = " + word);
        word = word.toUpperCase();
        System.out.println("word = " + word);
        String wordInLcase = word.toLowerCase();
        System.out.println("wordInLCase = " + wordInLcase); //change word to all lowercase letters. and assign back
    }
}

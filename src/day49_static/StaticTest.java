package day49_static;

public class StaticTest {
    static String word = "java";

    public static void main(String[] args) {
        // rule 1) static method can be called using classname
        StaticMethods.displayMessage("Wooden Spoon");
        // rule 1) instance method needs an object to be called
        //StaticMethods.instanceMethod(); //show error bcaz no object
        StaticMethods stm = new StaticMethods();
        stm.instanceMethod();

        // rule 2) static method can only access other static variable and method
        System.out.println(word);
    }
}

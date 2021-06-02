package day35_methods_with_param;

public class MethodsWithInputs {
    public static void main(String[] args) {
        displayValue(5);
        displayValue(15);
        displayValue(2+5);
        int count = 55;
        displayValue(count);
        for (int i = 0; i <=5; i++) {
            displayValue(12 + i);
        }
        greetByName("Inthira Kraithap");
        greetByName("Keada");

        String names = "Sawatdee"; // add variable and called by greetByGreet
        greetByName(names);
        String words = "hang in there";
        greetByName(words);

    }

    public static void displayValue(int num) {
        System.out.println("value is " + num);
    }
    /**
     * method name: greetByName
     * @param/input: String name
     * It prints "Hello {name}, how are you today?
     */
    public static void greetByName(String name){
        System.out.println("Hello "+name+ ", How are you today?");
    }
}

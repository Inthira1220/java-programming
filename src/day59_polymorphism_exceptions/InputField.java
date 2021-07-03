package day59_polymorphism_exceptions;

public class InputField implements WebElement {

    public static final String TAG_NAME = "input"; //This is the naming convention for final (Constant variables)

    @Override
    public void sendKeys(String txt) {
        System.out.println("Typing into input field - "+txt);

    }

    @Override
    public void click() {

    }

    @Override
    public String getText() {
        System.out.println("getting text of input field");
        return "java";

    }

    public String getValue() {
        System.out.println("getting value in the inputField");
        return "selenium";
    }
}

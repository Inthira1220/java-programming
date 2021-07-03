package day59_polymorphism_exceptions;

public class WebElementUtils {

    public static void clickElement(WebElement element) { //Link <-all share of the parent
        System.out.println("Click on Element");
        element.click(); // we dont have to create OBJECT each time

    }
    public static WebElement getLinkWithText(String txt){
        System.out.println("Searching for link with text = "+txt);
        return new Link();
    }

}

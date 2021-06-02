package day34_void_method;

//import jdk.swing.interop.SwingInterOpUtils;

public class EtsySearchTest {
    public static void main(String[] args) {
//        openBrowser
//        navigateToEtsyUrl
//        searchForWoodenSpoon
//        verifyResultsAreDisplayed
        System.out.println("--Starting Esty search smoke Test--");
        openBrowser();
        navigateToEtsyUrl();
        searchForWoodenSpoon();
        verifyResultsAreDisplayed();
        System.out.println("--Etsy test completed --");
    }
    public static void openBrowser(){
        System.out.println("Launching Chrome browser");

    }
    public static void navigateToEtsyUrl(){
        System.out.println("Navigator to https://www.etsy.com/ ");
    }
    public static void searchForWoodenSpoon(){
        System.out.println("Pass: verify home page is displayed ");
        System.out.println("Type 'Wooden spoon' and enter");
    }
    public static void verifyResultsAreDisplayed(){
        System.out.println("Click: https://www.etsy.com/search?q=wooden%20spoon&ref=auto-1");
    }
}

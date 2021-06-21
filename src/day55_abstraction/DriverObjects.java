package day55_abstraction;

public class DriverObjects {
    public static void main(String[] args) {
        ChromeDriver driver1 = new ChromeDriver();
        FirefoxDriver driver2 = new FirefoxDriver();
        WebDriver driver3 = new ChromeDriver(); //Poliphonism

        driver1.get("https://www.google.com");
        driver1.findElement("//input");
        System.out.println("Title = "+driver1.getTitle());
    }
}

package day59_polymorphism_exceptions;

public interface WebElement {

    public void sendKeys(String txt);
    void click();     //we can write without public and nothing wrong with it
    String getText();
}

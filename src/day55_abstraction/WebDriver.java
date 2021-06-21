package day55_abstraction;

public interface WebDriver {
    public abstract void get(String url);
    public abstract void findElement(String locator);
    void quit(); //this one same but with short hand
    String getTitle();
}

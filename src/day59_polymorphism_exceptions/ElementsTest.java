package day59_polymorphism_exceptions;

public class ElementsTest {

    public static void main(String[] args) {
        Link link = new Link();
        link.click();
        link.click();
        link.getText();
        link.sendKeys("hi");
        link.getLinkHref();

        WebElement loginLink = new Link();  //this is polymorphism way to call
        loginLink.click();
        String txt = loginLink.getText();
        System.out.println("txt = " + txt);
        //loginLink.getLinkHref(); <--error

        WebElement username = new InputField();
        username.sendKeys("wooden spoon");
        username.click();

        WebElementUtils.clickElement(loginLink);  //this one is static, we dont have to add new
        WebElementUtils.clickElement(username);
        //WebElementUtils.clickElement(new String ("hello")); //<=error, it's not a subclass of WebElement

        //WebElementUtils.getLinkWithText("login"); we can in-store to variable
        WebElement login = WebElementUtils.getLinkWithText("login");
        login.click();

    }
}

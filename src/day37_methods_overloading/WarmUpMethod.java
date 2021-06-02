package day37_methods_overloading;

public class WarmUpMethod {
    public static void main(String[] args) {
        loginVoid("Inthira", "123456");//positive test, sunny day
        loginVoid("cybertekStudent", "abc123"); //negative test, or

        System.out.println(login("cybertekStudent", "abc123"));
        //                                      == true can write or with out write bcaz variable mention true or false already
        if(login("cybertekStudent", "abc123") == true){
            System.out.println("Login successful, welcome to Canvas");
            System.out.println("select the course to continue");
        }else{
            System.out.println("loin failed");
        }
        boolean isLoginSuccess = login("nadir", "mountain");
        System.out.println("isLoginSuccess = " +  isLoginSuccess);

        if(login("nadir", "mountain")) {
            System.out.println("Welcome to Canvas, select course or calendar");
        } else {
            System.out.println("Something wrong with your credentials");
        }

        // String ret = System.out.println("hello"); ERROR. it is void
        }



    public static void loginVoid(String username, String password) {
        String secretUsername = "cybertekStudent";
        String secretPassword = "abc123";
        //  it can be .equals(secretUsername)
        if (username.equalsIgnoreCase(secretUsername) && password.equals(secretPassword)) {
            System.out.println("Successful, welcome CybertekStudent");
        } else {
            System.out.println("Incorrect username or password");
        }
    }

    public static boolean login(String userName, String password) {
        String secretUsername = "cybertekStudent";
        String secretPassword = "abc123";
        // return userName.equalsIgnoreCase(secretUsername) && password.equals(secretPassword);
        if (userName.equalsIgnoreCase(secretUsername) && password.equals(secretPassword)) {
            return true;
        } else {
            return false;
        }
    }
}
/**
 * method:
 * loginVoid
 * params:
 * String username, String password
 * <p>
 * return type:
 * VOID
 * <p>
 * in the method:
 * Declare : String secretUsername ="cybertekStudent", secretPassword = "abc123"
 * <p>
 * if(both match)
 * PRINT:
 * Login Successful, welcome cybertekStudent
 * ELSE
 * PRINT:
 * Incorrect username or password
 */


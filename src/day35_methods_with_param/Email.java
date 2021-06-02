package day35_methods_with_param;

import java.util.Locale;

public class Email {
    public static void main(String[] args) {

        buildEmail("kefind","gmail.com");
        buildEmail("K_intira","hotmail");
        buildEmail("K intira","hotmail");
        String name = "nooinkink";
        String emails = "hotmail";
        buildEmail(name, emails);

    }
    public static void buildEmail(String name, String domain){
        name = name.replace(" ","_").toLowerCase(); //replace space tp _ and change to lower case
        System.out.println("Your email: "+name+ "@"+ domain+".com");

    }
}

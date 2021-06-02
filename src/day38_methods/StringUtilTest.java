package day38_methods;
import static day38_methods.StringUtils.*;
  public class StringUtilTest {
      /**
       * import all static methods. so that you can just call by method name, without classname
       */

      public static void main(String[] args) {
          String userName = "";
          if (StringUtils.isNullOrEmpty(userName)) {
              System.out.println("FAIL: Username cannot be null or empty");
          }

          System.out.println("isPalinrome(civic) = " + StringUtils.isPalindrome("civic"));
          System.out.println("isPalindrome(kayak) = " + StringUtils.isPalindrome("kayak"));
          System.out.println("isPalindrome(Cybertek) = " + isPalindrome("Cybertek"));

          System.out.println(reverse("inthira"));
          System.out.println("reverse word of inthira is =>"+reverse("inthira"));
          String words = "java";
          System.out.println("reverse word of java is =>"+reverse(words));
      }
  }




/**
 * add new method:
 * name: isPalidrome
 * params: String str
 * return: boolean
 *
 * returns true if palindrome or false if not
 */

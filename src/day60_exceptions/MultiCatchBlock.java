package day60_exceptions;

public class MultiCatchBlock {

    public static void main(String[] args) {

        String word = "java";
        //String word = null;

        try {
            //System.out.println(10 / 0);
            System.out.println("word = " + word);
            System.out.println("word.length() = " + word.length());
            System.out.println("word.substring(2) = " + word.substring(2));
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught and handled, pls check if String have value");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Index is wrong, pls check if you entered a valid index");
        } catch (Throwable t) { //parent of all exceptions - parent type exception must be at end
            System.out.println("Exception is caught");
            System.out.println("Reason t.getCause() = " + t.getMessage());
        }
        System.out.println("--more code after try catch--");
    }
}

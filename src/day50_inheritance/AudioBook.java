package day50_inheritance;

public class AudioBook extends Book {
    int length;
    String narrator;

    public void listens() {
        System.out.println("listens to the AudioBook");
        System.out.println("title = " + title);
        System.out.println("author = " + author);
        System.out.println("type = " + type);
        System.out.println("author = " + author);
        System.out.println("price = " + price);
    }
}

package day50_inheritance;

public class BookObjects {
    public static void main(String[] args) {
        Book book = new Book();
        book.title = "intro Java";
        book.author = "Muradil";
        book.type = "Programming book";
        book.price = 85;


        System.out.println(book.title);
        System.out.println(book.author);
        System.out.println(book.type);
        System.out.println(book.price);

        AudioBook audioBook = new AudioBook();
        audioBook.title = "Harry Potter";
        audioBook.author = "JK Rolling";
        audioBook.type = "Kids book";
        audioBook.price = 10;
        audioBook.length = 1000;
        audioBook.narrator = "yes";
        audioBook.listens();

        System.out.println(audioBook.title);
        System.out.println(audioBook.author);
        System.out.println(audioBook.type);
        System.out.println(audioBook.price);

        Ebook ebook = new Ebook();
        ebook.size = 2;
        ebook.pages = 1000;


    }
}

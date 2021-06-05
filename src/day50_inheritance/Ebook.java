package day50_inheritance;

public class Ebook extends Book{
    int size;
    int pages;
            public void readBook(){
                System.out.println("Reading book ");
                System.out.println(title+" = Title");
                System.out.println(author+ " author of book");
                System.out.println(type+ " = Type of Book");
                System.out.println(price+ "$");
            }
}

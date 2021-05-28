package day47_constructors;

public class StudentObject {
    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student();

        Student st3 = new Student("Inthira");
        Student st4 = new Student("Keada");

        Student str5 = new Student(44);
        Student str6 = new Student("Beautiful", 44);

    }
}

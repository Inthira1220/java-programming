package day50_inheritance;

public class InheritanceTest {


    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Bakyt";
        p1.age = 30;

        p1.talk();
        p1.walk();
        p1.work("SDET");

        Teacher t1 = new Teacher();
        t1.teacherID = 1234;
        t1.name = "Saim";
        t1.age = 25;
        t1.talk();
        t1.walk();
        t1.teach("java inheritance");

        Student student = new Student();
        student.name = "keada";
        student.age = 44;
        student.walk();
        student.talk();
        student.study("study Automation");
        student.schoolName = "CybertekSchool";
        student.study("Java");

    }
}

package day47_constructors;

public class Student {
    public Student() {
        System.out.println("No-Args constructor");

    }

    public Student(String name) {
        System.out.println("Name param constructor: name =  " + name);

    }
    public Student (int age){
        System.out.println("Student age: "+ age);
    }
    public Student (String name, int age){
        System.out.println("name and age: "+ name +" and age "+ age+ " years old");
    }
}

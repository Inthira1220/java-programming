package day50_inheritance;

public class Person {
    /**
     * Super class
     * Parent class
     * Base class
     */
        String name;
        int age;

        public void walk() {
            System.out.println("Person is walking");
        }

        public void talk() {
            System.out.println(name + " is talking");
        }

        public void work(String job) {
            System.out.println("Person is working as " + job);
        }

}

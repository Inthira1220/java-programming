package day50_inheritance;

public class Student extends Person {

        String schoolName;
        String studentID;

        public void study(String topic) {
            System.out.println(name+ "Student studying " + topic+ " at ");
        }

}

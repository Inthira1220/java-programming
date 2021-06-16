package day54_abstraction;

import day54_abstraction.Student;

public class CampusStudent extends Student {
    @Override
    public void attendClass(){
        System.out.println("Campus student is attending the class in person");

    }
}

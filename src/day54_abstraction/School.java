package day54_abstraction;

import day54_abstraction.CampusStudent;
import day54_abstraction.OnlineStudent;

public class School {
    public static void main(String[] args) {
        //Student student = new Student(); //ERROR - bcaz cant use the new keyword
        OnlineStudent onlineStudent = new OnlineStudent();
        onlineStudent.attendClass();

        CampusStudent campusStudent = new CampusStudent();
        campusStudent.attendClass();


    }
}

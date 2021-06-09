package day51_inheritance;

public class Employee { //it is parent class
    String jobTitle;

    public double calculateSalary(double hourlyRate){

        return (52*40*hourlyRate)*1.1;  //return ann// ul working hourly, put formula to calculate
                                //*10% bonus
    }
    //toString method is inherited from Object class
    @Override //why is override right here!!
    public String toString() {
        return "Employee{" +
                "jobTitle='" + jobTitle + '\'' +
                '}';
    }
}

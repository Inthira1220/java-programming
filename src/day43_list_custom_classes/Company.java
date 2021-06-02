package day43_list_custom_classes;

public class Company {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.name = "INK";
        emp1.jobTitle = "SDET";

        System.out.println("emp1 name : "+emp1.name);
        System.out.println("emp1.jobTitle = " + emp1.jobTitle);
        emp1.work();

        Employee emp2 = new Employee();
        emp2.name = "INK Inkland";
        emp2.jobTitle= "Full Stack Developer";
        System.out.println("emp2 name : "+emp2.name);
        System.out.println("emp2.jobTitle = " + emp2.jobTitle);
        emp2.work();

    }
}

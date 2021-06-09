package day51_inheritance;

public class EmployeeObjects {
    public static void main(String[] args) {


        Employee developer = new Employee();
        developer.jobTitle ="Java Developer";
        developer.calculateSalary(55.0); // we can print directly w soutv
        System.out.println("developer.calculateSalary(55.0) = " + developer.calculateSalary(55.0)); //125840.00000000001
        // or store to variable
        double annualDevSalary = developer.calculateSalary(55); //annualDevSalary = 137280.0
        //
        System.out.println("annualDevSalary = " + Math.round(annualDevSalary));

        Contractor sdetContractor = new Contractor(); //in subClass in Contractor
        sdetContractor.jobTitle = "SDET";
        sdetContractor.calculateSalary(55.0);
        double sdetSalary = sdetContractor.calculateSalary(55);
        System.out.println("sdetSalary = " + sdetSalary); //sdetSalary = 110000.0
        System.out.println("developer.toString() = " + developer.toString());
        System.out.println("sdetContractor with no .toString() = " + sdetContractor);


    }
    }


package OfficeHours_Saim_Practice_03_02_2021;

public class Employee {
    public static void main(String[] args){
        String firstLastName = "Harry Potter";
        String companyName = "Hogwarts School of Witchcraft and Wizardry";
        int salaryPerYear = 100000;
        String dayMouthYear = "May12,1977";
        boolean fullTime = true;
        String jobTitle = "Witches Teacher";
        String officeAddress = "1234 London";
        System.out.println(" ------------------------------------------------------------------");
        System.out.println("|    ***Hogwarts School New Hire Information***                    |" );
        System.out.println("|"+firstLastName+ " Welcome to "+ companyName            +"|");
        System.out.println("|Your start date as a "+jobTitle+ " will be on "+ dayMouthYear +".       |");
        System.out.println("|You are full time: "+ fullTime + ", and you will make $" +salaryPerYear+ " per year.      |");
        System.out.println("|The Office location: "+ officeAddress+"                                  |");
        System.out.println(" ------------------------------------------------------------------ ");
        System.out.println("    ***Office Information***      " );
        System.out.println("New Hire name: "+ firstLastName);
        System.out.println("Start Date: "+ dayMouthYear);
        System.out.println("Your expected salary after 3 years: $"+ (salaryPerYear*12)*3);
    }
    /*Create a class Employee
create a main method
        Declare and assign these variables according to the most appropriate datatypes:
        (Use as many datatypes as you can for practice)
            - first name, last name, company name, salary, start day, start month,
            start year, are they full time, job title, office address,
    Declare new variables and use concatenation from previous variables to set their values
        - full name (first and last name)
        - full start date (start month date, year)
        - email (first name + start day @ $company name .com)
        - Salary after 3 years (base salary + start month * 10000)
    Ex: base: 100000
    start day: 2
    after 3 year: (100000 + (2 * 1000)) = 102000
    Display the values of the variables following given example image*/
}

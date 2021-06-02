package aaReplit_2_Statment;

public class Citizens {
    public static void main(String[] args) {
        /**
         * Enter current count for seniorCitizens and nonSeniorCitizens:
         * 5
         * 4
         * What is new citizen's age?
         * 66
         * Senior Citizen
         * New seniorCitizens count 6
         * New nonSeniorCitizens count 4
         */
        int countSeniorCitizens;
        int countNonSeniorCitizens;
        int age;
        System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens: 5, 4");
        countSeniorCitizens = 5;
        countNonSeniorCitizens = 4;
        System.out.println("What is new citizen's age? = 65");
        age = 65;
        if(age>=65){
            System.out.println("\"Senior Citizen\"");
            System.out.println("New seniorCitizens count "+ countSeniorCitizens++);
            System.out.println("New nonSeniorCitizens count "+ countNonSeniorCitizens++);
        }if (age<65){
            System.out.println("\"New seniorCitizens count ValueOfVariable\"");
            System.out.println("\"New nonSeniorCitizens count ValueOfVariable\"");
        }
    }
}

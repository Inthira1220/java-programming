package After_Class;

public class AgeGroupsOfAPerson {
    public static void main(String[] args) {


        String age = "Old Senior Citizen";
        System.out.println("The age groups of a person");

        if (age.equals("Infant")) {
            System.out.println(age + ": 0 < 1 year old, and invalid entry");
        } else if (age.equals("Toddler")) {
            System.out.println(age + ": 3 - 5 year old, and invalid entry");
        } else if (age.equals("Kids")) {
            System.out.println(age + ": 6 - 9 year old, and invalid entry");
        }else if (age.equals("Pre-Teen")) {
            System.out.println(age + ": 10 - 12 year old, and invalid entry");
        }else if (age.equals("Teenager")) {
            System.out.println(age + ": 13 - 17 year old, and invalid entry");
        }else if (age.equals("Young Adult")) {
            System.out.println(age + ": 18 - 20 year old, and invalid entry");
        }else if (age.equals("Adult")) {
            System.out.println(age + ": 21 - 39 year old, and nothing else is checked");
        }else if (age.equals("Young Middle-Aged Adult")) {
            System.out.println(age + ": 40 - 49 year old, and nothing else is checked");
        }else if (age.equals("Middle-Aged Adult")) {
            System.out.println(age + ": 50 - 54 year old, and nothing else is checked");
        }else if (age.equals("Very Young Senior Citizen")) {
            System.out.println(age + ": 55 - 64 year old, and nothing else is checked");
        }else if (age.equals("Young Senior Citizen")) {
            System.out.println(age + ": 65 - 74 year old, and nothing else is checked");
        }else if (age.equals("Senior Citizen")) {
            System.out.println(age + ": 75-84 year old, and nothing else is checked");
        }else{
            System.out.println( "Old Senior Citizen (85+)and nothing else is checked");
        }

    }
}
/*
Write a program that can define the age groups of a person.

Have a pre-condition(Outer if): if age > 120 or less than 0 ==> invalid entry, and nothing else is checked.

Age groups:
Infant (< 1 year), Toddler (3 - 5), Kid (6 - 9), Pre-Teen (10 - 12),
Teenager (13 - 17), Young Adult (18 - 20), Adult (21 - 39), Young Middle-Aged Adult (40 - 49),
Middle-Aged Adult (50 - 54), Very Young Senior Citizen (55 - 64), Young Senior Citizen (65 - 74),
Senior Citizen (75 - 84), Old Senior Citizen (85+)

Based on the given age find and print which age group they are in.
 */
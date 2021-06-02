package After_Class;

public class FieldTripSwitch16March21 {
    public static void main(String[] args) {
        System.out.println("****Every year Field Trip****");

        String grade = "Grade 0";
        String location;
        String teacherInCharge;
        int numberOfGroup;

        switch (grade) {
            case "Grade 1":
                location = "Apple orchard";
                numberOfGroup = 3;
                teacherInCharge = "Ms. Smith";
                System.out.println(grade + " - Teacher's name: " + teacherInCharge + "\nNumber of Group: no. "
                        + numberOfGroup + " , meet at Location: " + location);
                break;
            case "Grade 2":
                location = "Zoo";
                numberOfGroup = 7;
                teacherInCharge = "Mr. Lee";
                System.out.println(grade + " - Teacher's name: " + teacherInCharge + "\nNumber of Group: no. "
                        + numberOfGroup + " , meet at Location: " + location);
                break;
            case "Grade 3":
                location = "Aquarium";
                numberOfGroup = 5;
                teacherInCharge = "Ms. Wilson";
                System.out.println(grade + " - Teacher's name: " + teacherInCharge + "\nNumber of Group: no. "
                        + numberOfGroup + " , meet at Location: " + location);
                break;
            case "Grade 4":
                location = "Movie theater";
                numberOfGroup = 3;
                teacherInCharge = "Ms. Reyes";
                System.out.println(grade + " - Teacher's name: " + teacherInCharge + "\nNumber of Group: no. "
                        + numberOfGroup + " , meet at Location: " + location);
                break;
            case "Grade 5":
                location = "Museum";
                numberOfGroup = 5;
                teacherInCharge = "Mr. Lala";
                System.out.println(grade + " - Teacher's name: " + teacherInCharge + "\nNumber of Group: no. "
                        + numberOfGroup + " , meet at Location: " + location);
                break;
            case "Grade 6":
                location = "Six Flags";
                numberOfGroup = 8;
                teacherInCharge = "Mr. Watt";
                System.out.println(grade + " - Teacher's name: " + teacherInCharge + "\nNumber of Group: no. "
                        + numberOfGroup + " , meet at Location: " + location);
                break;
            default:
                System.out.println("if you dont know your group name pls contact your principle");
                break;
        }

    }

}

//Switch
//
//        [Field Trip]
//        Your school goes on a Field trip each year. The place you go will be based on your grade.
//        Given some grade number (1-6) figure out the details of your field trip.
//        Print the information at the end.
//
//        Data based on grade:
//
//        grade - 1
//        location -  Apple orchard
//        number of groups - 3
//        teacher in charge - Ms. Smith
//
//        grade - 2
//        location - Zoo
//        number of groups - 7
//        teacher in charge - Mr. Lee
//
//        grade - 3
//        location - Aquarium
//        number of groups - 5
//        teacher in charge - Ms. Wilson
//
//        grade - 4
//        location - Movie theater
//        number of groups - 2
//        teacher in charge - Ms. ReyesMovie theater
//
//        grade - 5
//        location - Museum
//        number of groups - 5
//        teacher in charge - Ms. Lela
//
//        grade - 6
//        location - Six Flags
//        number of groups - 8
//        teacher in charge - Mr. Watt

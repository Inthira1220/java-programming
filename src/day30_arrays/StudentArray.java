package day30_arrays;

public class StudentArray {
    public static void main(String[] args) {
        /**
         * id        - 0
         * firstName - 1
         * lastName  - 2
         * batchNum  - 3
         * phoneNum  - 4
         *
         * Declare student array and store 5 String values
         *
         * String[] student1 = {"1234", "Adam"...};
         *
         * String[] student2 = new String[5];
         */
        String[] student1 = new String[5]; //<-----length 5
        student1[0] = "1728";
        student1[1] = "Inthira";
        student1[2] = "Kraithap";
        student1[3] = "B22";
        student1[4] = "703-473-9141";
        //String[] student1 = {"1728", "Inthira", "Kraithap", "B22", "703-473-9141"};
        String[] student2 = {"0000", "Keada", "Inkland", "B22", "703-473-0000"}; //<---short way is good when you know your items
        System.out.println("Student1 ID Number: " + student1[0]);
        System.out.println("Student1 name: " + student1[1]);
        System.out.println("Student1 last name: " + student1[2]);
        System.out.println("Student1 Batch number: " + student1[3]);
        System.out.println("Student1 phone number: " + student1[4]);
        System.out.println("Student data length: " + student1.length); //<-----data length is 5

        //check if student1 data array contains 5 items.
        // true: PASS: data array has correct length
        //false: FAIL: data array has incorrect length

        /**
         check if student1 and student2 arrays have same number of data
         TRUE: PASS: data arrays length match
         FALSE: FAIL: data arrays length mismatch
         */

        if (student1.length == 5) {
            System.out.println("true: PASS: data array has correct length");

        } else {
            System.out.println("false: FAIL: data array has incorrect length");
        }
        if (student1.length == student2.length) {
            System.out.println("TRUE: PASS: data arrays length match");
        } else {
            System.out.println("FALSE: FAIL: data arrays length mismatch");

        }
        //print firstName and lastName in uppercase
        System.out.println(student1[1].toUpperCase() + " " +student1[2].toUpperCase());


    }
}

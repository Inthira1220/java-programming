package day18_conditions_practice_string_intro;

public class CarLeasingTest {
    public static void main(String[] args) {
        String make = "Mecedes";
        String model = "E";
        double leasePrice = 0.0;
        //        if(make.equals("Mercedes") && model.equals("E")) {
//            leasePrice = 500.0;
//        }else if (make.equals("Mercedes") && model.equals("A")) {
//            leasePrice = 400.0;
//        }
        if (make.equals("Mercedes")) {
            if (model.equals("E")) {
                leasePrice = 500.0;
            }else if (model.equals("A")) {
                leasePrice = 400.0;
            }
        }else {
            System.out.println("Invalid make");
        }

        System.out.println("make = " + make);
        System.out.println("model = " + model);
        System.out.println("leasePrice = " + leasePrice);

    }
        }


//add new class CarLeasingTest
//
//Make => Mercedes
//        Model =>  E
//        leasePrice = 500
//        Model => A
//        leasePrice = 400
//
//        Make => Audi
//        Model =>  SQ5
//        leasePrice = 552
//        Model => A3
//        leasePrice = 412
package day17_ternary_nested_conditions;

public class MoreTernary {
    public static void main(String[] args) {
        int hourlyRate = 50;
        /* String reply = "Accept"; //  or reject

        if (hourlyRate > 45){
            reply = "accept";
        }else{
        reply = "reject";}
        System.out.println("Reply = " + reply);

        */
        String reply = (hourlyRate > 45) ? "Accept":"Reject";
        System.out.println("reply = " + reply);
        //when houtlyRate > 45
        // reply = "accept
        //otherwise = reject

        String todayClass = "java";
        String teacher = (todayClass.equals("java")) ? "Saim|Murodil" : "Nadir";
        System.out.println("Today's Teacher = "+ teacher);

        boolean isEligibleToDrive = true;
        //String driving; // "have DL, can drive" "No DL, cannot drive"
        String driving = (isEligibleToDrive = true) ? "have DL, can drive": "No DL, cannot drive";
        System.out.println("driving = " + driving);


    }
}

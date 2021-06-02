package day20_string_mainpulation;

public class StringIsEmpty {
    public static void main(String[] args) {
        String jobtitle = "";
        String j = "  ";

        System.out.println(jobtitle.length());//0 <- check the value
        System.out.println(jobtitle.length() == 0);//true
        System.out.println(jobtitle.isEmpty());//true
        System.out.println(jobtitle.equals("0"));//false
        System.out.println(jobtitle.equalsIgnoreCase("0"));//false


        if (jobtitle.isEmpty()) {    //<= true
            System.out.println("job title is missing, pls resend");
        } else {
            System.out.println("job tittle looks good");
        }

        if (jobtitle.length() == 0) {  //<=true
            System.out.println("job tile is empty");
        } else {
            System.out.println(" job title is not empty");
        }
        System.out.println(jobtitle.equals(" "));//false
        System.out.println("=============================");

        String veggie = "carrots";
        System.out.println(veggie.isEmpty());//false bcaz it is character

        //if veggies is not empty, print we have carrot!
        if(!veggie.isEmpty()) {
            System.out.println("is not empty!");
        }else{
            System.out.println("is empty");
        }

    }
}

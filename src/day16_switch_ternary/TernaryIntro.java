package day16_switch_ternary;

public class TernaryIntro {
    public static void main(String[] args) {
        int score = 50;
        String result = (score>60) ? "pass" : "Fail";
        System.out.println(result);//fail
    }

}
/*
String result;
		int score>60){
		result = "pass";
		}else{
		result = "fail";
		}
		---------------------------------
		int score = 90;
		String result = (score>60)?"pass":"Fail"; //pass
 */
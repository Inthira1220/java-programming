package day07_arithemetic_operators_casting;

public class StringConcatPractice {
    public static void main(String[] args){
        System.out.println("java" + 5 + 3);//java53
        System.out.println("java" + (5 + 3));//java8 ()->over take called addition
        System.out.println(5 + 3 + "java");
        System.out.println(5+ (3+"java"));// 5+3java
        System.out.println("hello"+1+2+3);// string, number didnt combine additional
        System.out.println("hello "+ (1+2+3));

        String str1 = "hello";
        String str2 = "friends";
        System.out.println(str1+str2);
        System.out.println(str1+" "+str2);// hello friends
        int num1 = 7;
        int num2 = 8;
        System.out.println(num1+num2);//15
        System.out.println(num1+" "+num2);//1,5. " " => it declared =>space
        System.out.println(+num1+""+num2);//Put number together, "" it declared =>empty

        char char1 = 'a';
        char char2 = 'b';
        System.out.println(char1+char2);// char declared number
        System.out.println(char1+""+char2);
        System.out.println(""+char1+char2);
        System.out.println(char1+char2+"");//put "" behind the result came out from front to back

    }
}

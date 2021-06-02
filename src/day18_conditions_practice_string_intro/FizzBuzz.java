package day18_conditions_practice_string_intro;

public class FizzBuzz {
    public static void main(String[] args) {

        int num = 7; // 3, 9, 10 ถ้าใส่ 7 ก็จะไม่ปริ้น @ else อย่างเดียว


        if (num % 3 == 0 && num % 5 ==0) {              // && ทำให้ข้ามไปปริ้น next condition
            System.out.println("FizzBuzz: when number is divisible by 3 and 5 => "+num);
        }else if(num % 3 == 0 ) {
            System.out.println("Fizz: when number is divisible by 3 =>"+num);
        }else if(num % 5  == 0){
            System.out.println("Buzz: when number is divisible by 5 =>"+num);
        }else{
            System.out.println(num);
        }
    }
}

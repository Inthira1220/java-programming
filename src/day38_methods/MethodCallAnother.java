package day38_methods;

import java.security.PublicKey;


public class MethodCallAnother {
    public static void main(String[] args) {
        start();
    }

    public static void start() {
        System.out.println("start");
        keepContinue();
    }

    public static void keepContinue() {
        System.out.println("continue");
        end();

    }

    public static void end() {
        System.out.println("end");
    }
}

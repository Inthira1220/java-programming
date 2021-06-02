package Practice_03_16_2021;

public class ExampleIf {
    public static void main(String[] args) {
        int a = 10;
        int b = a-- * 2 - --a % 2 + a;
        // 10 * 2 - 8 % 2 +8
        // 20 -8 % 2 + 8
        // 20 -8  % 2 + 8
        // 8% 2 = 0
        // 20 - 0 + 8

        // even and odd

        System.out.println(b);
        System.out.println();
        if (11 % 2 == 00) {
            System.out.println("Even");
        } else {
            System.out.println("odd");
        }

    }
}
// 2 % 7 =2
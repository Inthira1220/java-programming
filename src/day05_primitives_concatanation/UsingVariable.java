package day05_primitives_concatanation;

public class UsingVariable {
    public static void main(String[] args){
        int num1 = 100;
        int num2 = num1;
        System.out.println(num1);//print out 100
        System.out.println(num2);//print out 100
        num1 = 200;
        System.out.println(num1);//print out 200
        System.out.println(num2);//print out 200
        int n1 = 55;
        int n2 = n1;
        int n3 = n2;
        System.out.println(n3);// n1=n2=n3
        System.out.println(n1+ "\t" + n2 + "\t" + n3 + "\t");
        int inthirasZipCode = 22182;
        int parvinsZipCode = inthirasZipCode;
        System.out.println(inthirasZipCode);
        System.out.println(parvinsZipCode);
        inthirasZipCode = 20007;
        System.out.println(inthirasZipCode);//print out 22007
        System.out.println(parvinsZipCode);//still stay in the previous zipcode
        parvinsZipCode = 33131;
        System.out.println(parvinsZipCode);// change to line24
    }
}

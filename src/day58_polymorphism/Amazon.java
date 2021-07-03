package day58_polymorphism;

public class Amazon extends OnlineShop implements Prime{
    @Override
    public void buy() {
        System.out.println("Buying items on amazon.com");
    }

    @Override
    public void sell() {
        System.out.println("Selling items on amazon.com");

    }

    @Override
    public void primeSipping() {
        System.out.println("Free-2 days shipping for prime users");
    }
}

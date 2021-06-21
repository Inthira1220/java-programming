package day55_abstraction.interfaces_demo;

public interface MyInterface {
    public abstract void learn();
    //abstract can write without public abstract like this and with out complain=> void learn
}
interface MyInterface2{

}

class MyClass implements MyInterface, MyInterface2{

    @Override
    public void learn() {
        System.out.println("Learning in MyClass");

    }
}
class Main{
    public static void main(String[] args) {
        //MyInterface myInterface = new MyInterface(); =>ERROR
        MyClass myClass = new MyClass();

    }
}

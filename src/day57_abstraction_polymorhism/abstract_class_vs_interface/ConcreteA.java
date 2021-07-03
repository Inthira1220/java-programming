package day57_abstraction_polymorhism.abstract_class_vs_interface;

public class ConcreteA extends AbstractA implements InterfaceA, InterfaceB{

    @Override
    public void absMethodA(){
        System.out.println("absMethodA implementation is called");
    }
    @Override
    public void methodB(){
        System.out.println("methodB overridden version is called");
    }
    //@Override => no writing @Override bcaz static methods are hidden
    public static void staticMethodC(){
        System.out.println("static methodC hidden version is called");
    }

    @Override
    public void absMethodD(int num) {
        System.out.println("absMethodD overridden is called "+ num);
    }
}

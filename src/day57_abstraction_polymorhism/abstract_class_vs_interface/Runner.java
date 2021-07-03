package day57_abstraction_polymorhism.abstract_class_vs_interface;

public class Runner {
    public static void main(String[] args) {
        //AbstractA absA = new AbstractA();             cannot create like this
        //InterfaceA iA = new InterfaceA();             cannot create like this


        InterfaceA.staticMethodE("wooden spoon"); //staticMethodE is called with str - wooden spoon
        //ConcreteA.staticMethodE("hello"); //staticMethodE only can ve called from interface
        ConcreteA.staticMethodC();

    }
}


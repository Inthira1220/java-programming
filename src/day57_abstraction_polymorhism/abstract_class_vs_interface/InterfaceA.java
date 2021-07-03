package day57_abstraction_polymorhism.abstract_class_vs_interface;

public interface InterfaceA {

    public static final String TYPE = "interface";
    double MAX_COUNT = 500;  //this is also public static final

    public abstract void absMethodD(int num);



    /**
     * Starting from java 8
     * Interface can have : 1. Abstract methods
     *                      2. Static methods
     *                      3. Default methods
     * @param
     */
    public static void staticMethodE(String str){
        System.out.println("staticMethodE is called with str - "+str);
    }

    public default void defaultMethodF(){
        System.out.println("defaultMethodF is called");
    }
}

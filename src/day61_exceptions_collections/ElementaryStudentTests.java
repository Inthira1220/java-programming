package day61_exceptions_collections;

public class ElementaryStudentTests {
    public static void main(String[] args) {
        try{
        ElementaryStudent el1 = new ElementaryStudent();
        el1.setName("Bob");
        el1.setAge(15);
        System.out.println("el1.toString() = " + el1.toString());
    }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("---Execution excepted---");
    }
}

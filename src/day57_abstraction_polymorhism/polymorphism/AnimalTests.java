//package day57_abstraction_polymorphism.polymorphism;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class AnimalTests {
//    public static void main(String[] args) {
//        day57_abstraction_polymorphism.polymorphism.Animal a1 = new day57_abstraction_polymorphism.polymorphism.Animal(); //not polymorphic, data type and object type are SAME
//        a1.makeNoise();
//        //Polymorphism - polymorphic way:
//        //parent type =  new child type
//        day57_abstraction_polymorphism.polymorphism.Animal animal1 = new Dog();
//        day57_abstraction_polymorphism.polymorphism.Animal animal2 = new Horse();
//        day57_abstraction_polymorphism.polymorphism.Animal cat = new day57_abstraction_polymorphism.polymorphism.Cat();
//        //List list = new ArrayList();
//        animal1.makeNoise();
//        animal2.makeNoise();
//        cat.makeNoise();
//
//        //Polymorphic list of objects. List data type is Parent class.
//        //objects are any of child classes.
//        List<day57_abstraction_polymorphism.polymorphism.Animal> listOfAnimals= new ArrayList<>();
//        listOfAnimals.add(new Dog());
//        listOfAnimals.add(new Dog());
//        listOfAnimals.add(new Horse());
//        listOfAnimals.add(new day57_abstraction_polymorphism.polymorphism.Cat());
//        for (day57_abstraction_polymorphism.polymorphism.Animal each : listOfAnimals) {
//            each.makeNoise();
//        }
//
//    }
//}
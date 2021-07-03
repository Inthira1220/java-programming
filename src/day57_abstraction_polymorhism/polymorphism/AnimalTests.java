package day57_abstraction_polymorhism.polymorphism;

import day12_conditional_statemants.AmazonFreeShipping;

public class AnimalTests {
    public static void main(String[] args) {
        Animal a1 = new Animal(); // not polymorphic, data type and object type are same
        a1.makeNoise();

        //Polymorphism - polymorphic way
        // parent type = new child type(class name)
        Animal animal1 = new Dog();
        Animal animal2 = new Horse();
        Animal animal3 = new Cat();

        animal1.makeNoise();
        animal2.makeNoise();
        animal3.makeNoise();

    }
}

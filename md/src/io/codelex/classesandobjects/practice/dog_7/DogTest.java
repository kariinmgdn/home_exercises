package io.codelex.classesandobjects.practice.dog_7;

public class DogTest {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Max", "male", "Rocky", "Lady");
        Dog dog2 = new Dog("Rocky", "male", "Sam", "Molly");
        Dog dog3 = new Dog("Sparky", "male", null, null);
        Dog dog4 = new Dog("Buster", "male", "Sparky", "Lady");
        Dog dog5 = new Dog("Sam", "male", null, null);
        Dog dog6 = new Dog("Lady", "female", null, null);
        Dog dog7 = new Dog("Molly", "female", null, null);
        Dog dog8 = new Dog("Coco", "female", "Buster", "Molly");
        System.out.println(dog1.dogs());
        System.out.println(dog3.fathersName());
        System.out.println(dog1.hasSameMotherAs(dog4));
        System.out.println(dog1.hasSameMotherAs(dog2));
    }
}

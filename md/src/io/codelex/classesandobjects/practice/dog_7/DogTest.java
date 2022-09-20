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
        System.out.println(dog2.dogs());
        System.out.println(dog3.dogs());
        System.out.println(dog4.dogs());
        System.out.println(dog5.dogs());
        System.out.println(dog6.dogs());
        System.out.println(dog7.dogs());
        System.out.println(dog8.dogs());
    }
}

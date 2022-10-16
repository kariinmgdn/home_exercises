package io.codelex.polymorphism.practice.exercise6;

public class Mouse  extends Mammal{


    protected Mouse(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("> Squeak squeak");
    }

    @Override
    public void eatFood(Food food) {
        super.eatFood(food);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

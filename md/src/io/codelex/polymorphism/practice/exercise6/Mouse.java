package io.codelex.polymorphism.practice.exercise6;

public class Mouse  extends Mammal{
    protected Mouse(String animalName, String animalType, Double animalWeight,
                    Integer foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("> Squeak squeak");
    }

    @Override
    public void eatFood() {
        super.eatFood();
    }
}

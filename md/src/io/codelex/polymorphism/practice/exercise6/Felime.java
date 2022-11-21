package io.codelex.polymorphism.practice.exercise6;

public class Felime extends Mammal{

    protected Felime(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void eatFood(Food food) {
        super.eatFood(food);
    }
}

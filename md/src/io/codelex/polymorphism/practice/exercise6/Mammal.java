package io.codelex.polymorphism.practice.exercise6;

public class Mammal extends Animal{

    private String livingRegion;

    protected Mammal(String animalName, String animalType, Double animalWeight, Integer foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten);
        this.livingRegion = livingRegion;
    }

    @Override
    public void makeSound() {
    }

    @Override
    public void eatFood() {

    }
}

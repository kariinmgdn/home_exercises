package io.codelex.polymorphism.practice.exercise6;

public class Cat extends Felime{

    private String breed;
    protected Cat(String animalName, String animalType, Double animalWeight, Integer foodEaten, String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("> Meowwww");
    }

    @Override
    public void eatFood() {
        super.eatFood();
    }
}

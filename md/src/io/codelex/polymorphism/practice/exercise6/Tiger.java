package io.codelex.polymorphism.practice.exercise6;

public class Tiger extends Felime{
    protected Tiger(String animalName, String animalType, Double animalWeight, Integer foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("> ROAAR!!!");
    }

    @Override
    public void eatFood() {
        super.eatFood();
    }
}

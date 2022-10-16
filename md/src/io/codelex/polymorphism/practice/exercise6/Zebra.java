package io.codelex.polymorphism.practice.exercise6;

public class Zebra extends Mammal{

    protected Zebra(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("Alex, look at me. I'm ten years old." +
                " My life is half over." +
                " And I don't even know if I'm black with white stripes or white with black stripes.");
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

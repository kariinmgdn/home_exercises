package io.codelex.polymorphism.practice.exercise6;

public class Mammal extends Animal{

    private final String livingRegion;

    protected Mammal(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight);
        this.livingRegion = livingRegion;
    }


    @Override
    public void makeSound() {
    }

    @Override
    public void eatFood(Food food) {
        super.eatFood(food);
    }

    @Override
    public String toString() {
        return getAnimalType() + " [" + getAnimalName() +
                ", " + getAnimalWeight() + ", " + getLivingRegion() + ", " + getFoodEaten() + "]";
    }

    public String getLivingRegion() {
        return livingRegion;
    }
}

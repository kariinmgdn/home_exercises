package io.codelex.polymorphism.practice.exercise6;

public class Cat extends Felime{

    private final String breed;

    protected Cat(String animalName, String animalType, Double animalWeight, String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, livingRegion);
        this.breed = breed;
    }


    @Override
    public void makeSound() {
        System.out.println("> Meowwww");
    }

    @Override
    public void eatFood(Food food) {
        super.eatFood(food);
    }

    public String getBreed() {
        return breed;
    }

    public String toString() {
        return getAnimalType() + " [" + getAnimalName() + ", " + getBreed() +
                ", " + getAnimalWeight() + ", " + getLivingRegion()  + ", " + getFoodEaten() + "]";
    }
}

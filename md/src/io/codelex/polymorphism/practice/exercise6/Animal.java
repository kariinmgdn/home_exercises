package io.codelex.polymorphism.practice.exercise6;

public abstract class Animal {
    private final String animalName;
    private final String animalType;
    private final Double animalWeight;
    private final Integer foodEaten;

    protected Animal(String animalName, String animalType, Double animalWeight, Integer foodEaten) {
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalWeight = animalWeight;
        this.foodEaten = foodEaten;
    }

    public abstract void makeSound();
    public abstract void eatFood();

    public String getAnimalName() {
        return animalName;
    }

    public String getAnimalType() {
        return animalType;
    }

    public Double getAnimalWeight() {
        return animalWeight;
    }

    public Integer getFoodEaten() {
        return foodEaten;
    }
}

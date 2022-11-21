package io.codelex.polymorphism.practice.exercise6;

public class Tiger extends Felime{


    protected Tiger(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("> ROAAR!!!");
    }

    @Override
    public void eatFood(Food food) {
        if (food instanceof Meat) {
            super.eatFood(food);
        } else {
            System.out.println(getAnimalType() + " is not eating that type of food!");
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

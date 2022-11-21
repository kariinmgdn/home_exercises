package io.codelex.polymorphism.practice.exercise1;

public class Audi implements Car{
    private Integer currentSpeed = 0;

    public void speedUp() {
        currentSpeed += 10;
    }

    public void slowDown() {
        currentSpeed += 10;
    }

    public int showCurrentSpeed() {
        return currentSpeed;
    }

    @Override
    public String toString() {
        return "Audi{" +
                "currentSpeed=" + currentSpeed +
                '}';
    }

    public void startEngine() {
        System.out.println("Rrrrrrr.....");
    }
}

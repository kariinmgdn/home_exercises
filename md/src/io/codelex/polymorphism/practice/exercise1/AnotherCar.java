package io.codelex.polymorphism.practice.exercise1;

public class AnotherCar implements Car {
    private Integer currentSpeed = 0;

    @Override
    public void speedUp() {
        currentSpeed += 13;
    }

    @Override
    public void slowDown() {
        currentSpeed += 13;
    }

    @Override
    public String toString() {
        return "AnotherCar{" +
                "currentSpeed=" + currentSpeed +
                '}';
    }

    @Override
    public int showCurrentSpeed() {
        return currentSpeed;
    }
}

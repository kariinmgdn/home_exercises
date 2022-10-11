package io.codelex.polymorphism.practice.exercise1;

public class NewCar implements Car, Boost {

    private Integer currentSpeed = 0;

    @Override
    public void speedUp() {
        currentSpeed += 15;
    }

    @Override
    public void slowDown() {
        currentSpeed += 15;
    }

    @Override
    public int showCurrentSpeed() {
        return currentSpeed;
    }

    @Override
    public void useNitrousOxideEngine() {
        currentSpeed += 100;
    }

    @Override
    public String toString() {
        return "NewCar{" +
                "currentSpeed=" + currentSpeed +
                '}';
    }
}

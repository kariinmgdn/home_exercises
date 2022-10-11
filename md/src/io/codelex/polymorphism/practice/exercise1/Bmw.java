package io.codelex.polymorphism.practice.exercise1;

public class Bmw implements Car{
    private Integer currentSpeed = 0;

    public void speedUp() {
        currentSpeed += 12;
    }

    public void slowDown() {
        currentSpeed += 12;
    }

    @Override
    public String toString() {
        return "Bmw{" +
                "currentSpeed=" + currentSpeed +
                '}';
    }

    public int showCurrentSpeed() {
        return currentSpeed;
    }

    public void startEngine() {
        System.out.println("Rrrrrrr.....");
    }
}

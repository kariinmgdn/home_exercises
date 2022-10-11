package io.codelex.polymorphism.practice.exercise1;

public class Tesla implements Car {
    private Integer currentSpeed = 0;

    @Override
    public void speedUp() {
        currentSpeed += 20;
    }

    @Override
    public void slowDown() {
        currentSpeed += 20;
    }

    @Override
    public String toString() {
        return "Tesla{" +
                "currentSpeed=" + currentSpeed +
                '}';
    }

    public int showCurrentSpeed() {
        return currentSpeed;
    }

    public void startEngine() {
        System.out.println("-- silence ---");
    }


}

package io.codelex.polymorphism.practice.exercise1;

public class Lexus implements Car, Boost{
    private Integer currentSpeed = 0;

    public void speedUp() {
        currentSpeed += 8;
    }

    public void slowDown() {
        currentSpeed += 8;
    }

    @Override
    public String toString() {
        return "Lexus{" +
                "currentSpeed=" + currentSpeed +
                '}';
    }

    public int showCurrentSpeed() {
        return currentSpeed;
    }

    public void useNitrousOxideEngine() {
        currentSpeed = currentSpeed + 30;
    }

    public void startEngine() {
        System.out.println("Rrrrrrr.....");
    }
}

package io.codelex.polymorphism.practice.exercise1;

public interface Car{
    void speedUp();

    void slowDown();

    default int showCurrentSpeed() {
        return 0;
    }
}

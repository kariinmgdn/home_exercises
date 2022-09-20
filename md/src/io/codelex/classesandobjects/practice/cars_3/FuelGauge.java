package io.codelex.classesandobjects.practice.cars_3;

public class FuelGauge {

    private int currentAmountOfFuel;

    public FuelGauge(int currentAmountOfFuel) {
        this.currentAmountOfFuel = currentAmountOfFuel;
    }

    public int incrementFuel() {
        if (currentAmountOfFuel < 70) {
            currentAmountOfFuel++;
        } else {
            currentAmountOfFuel = 70;
        }
        return currentAmountOfFuel;
    }

    public int setCurrentAmountOfFuel(int currentAmountOfFuel) {
        this.currentAmountOfFuel = currentAmountOfFuel;
        return currentAmountOfFuel;
    }

    public int decrementFuel() {
        while (currentAmountOfFuel > 0) {
            currentAmountOfFuel--;
        }
        return currentAmountOfFuel;
    }

    public int getCurrentAmountOfFuel() {
        return currentAmountOfFuel;
    }
}

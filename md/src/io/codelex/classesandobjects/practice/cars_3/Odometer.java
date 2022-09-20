package io.codelex.classesandobjects.practice.cars_3;

public class Odometer {

    private int mileage;

    public Odometer(int mileage) {
        this.mileage = mileage;
    }

    public int getMileage() {
        return mileage;
    }

    public void incrementMileage() {
        FuelGauge fuel = new FuelGauge(5);
        for (int i = 0; i < 10; i++) {
            if (i == 9) {
                fuel.setCurrentAmountOfFuel(fuel.decrementFuel());
            }
        }
        if (fuel.getCurrentAmountOfFuel() > 0 && mileage < 999999) {
            mileage++;
        } else {
            mileage = 999999;
        }
    }
}

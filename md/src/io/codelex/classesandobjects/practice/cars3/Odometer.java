package io.codelex.classesandobjects.practice.cars3;

public class Odometer {

    private int mileage;

    public void incrementMileage(FuelGauge gauge) {
        if (mileage < 999999) {
            mileage++;
            System.out.println("Current amount of mileage " + mileage + " and current amount of fuel is " + gauge.getCurrentAmountOfFuel() + " l");
        } else {
            mileage = 0;
        }
    }

    public void fuelDecrement(FuelGauge gauge) {
        if (mileage % 10 == 0) {
            gauge.decrementFuel();
        }
    }
}

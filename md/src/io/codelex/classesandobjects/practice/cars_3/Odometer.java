package io.codelex.classesandobjects.practice.cars_3;

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

    public void fuelDecreasment(FuelGauge gauge) {
        if (mileage%10 == 0) {
            gauge.decrementFuel();
        }
    }
}

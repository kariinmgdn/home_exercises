package io.codelex.classesandobjects.practice.cars_3;

public class Ride {
    public static void main(String[] args) {
        FuelGauge gauge = new FuelGauge();
        Odometer miles = new Odometer();

        while (gauge.getCurrentAmountOfFuel() < 5) {
            gauge.incrementFuel();
        }

        while (gauge.getCurrentAmountOfFuel() > 0) { {
            miles.incrementMileage(gauge);
            miles.fuelDecreasment(gauge);
        }
        }

    }
}

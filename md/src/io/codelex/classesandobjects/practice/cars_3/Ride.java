package io.codelex.classesandobjects.practice.cars_3;

public class Ride {
    public static void main(String[] args) {
        Odometer ride = new Odometer(66);
        FuelGauge fuel = new FuelGauge(5);
        fuel.setCurrentAmountOfFuel(5);
        while (fuel.getCurrentAmountOfFuel() > 0) {
            ride.incrementMileage();
            System.out.println(ride.getMileage());
        }
    }
}

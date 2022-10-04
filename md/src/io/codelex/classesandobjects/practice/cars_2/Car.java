package io.codelex.classesandobjects.practice.cars_2;

public class Car {

    private final double startKilometers;
    private double liters = 0;

    public Car(double startKilometers) {
        this.startKilometers = startKilometers;
    }

    public double calculateConsumption() {
        return getStartKilometers() / liters;
    }

    public boolean gasHog() {
        return calculateConsumption() < 15;
    }

    public boolean economyCar() {
        return calculateConsumption() > 15;
    }

    public double fillUp(double km, double liters) {
        this.liters += liters;
        return km - getStartKilometers();
    }

    public double getStartKilometers() {
        return startKilometers;
    }
}

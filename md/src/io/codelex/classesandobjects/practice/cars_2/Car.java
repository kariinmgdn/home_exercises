package io.codelex.classesandobjects.practice.cars_2;

public class Car {

    private double startKilometers;
    private double endKilometers;
    private double liters;


    public Car(double startKilometers, double endKilometers, double liters) {
        this.startKilometers = startKilometers;
        this.endKilometers = endKilometers;
        this.liters = liters;
    }

    public double calculateConsumption() {
        return (endKilometers - startKilometers) / liters;
    }

    public boolean gasHog() {
        if (calculateConsumption() > 15) {
            return true;
        }
        return false;
    }

    public boolean economyCar() {
        if (calculateConsumption() < 15) {
            return true;
        }
        return false;
    }
}

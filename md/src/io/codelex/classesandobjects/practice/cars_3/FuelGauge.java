package io.codelex.classesandobjects.practice.cars_3;

public class FuelGauge {

    public final int MAX_FUEL = 70;
    private int currentAmountOfFuel;

    public void incrementFuel() {
        if (currentAmountOfFuel < MAX_FUEL) {
            currentAmountOfFuel++;
            System.out.println(getCurrentAmountOfFuel());
        } else {
            System.out.println("The tank is already full!");
        }
    }


    public void decrementFuel() {
        if (currentAmountOfFuel > 0) {
            currentAmountOfFuel--;
        } else {
            System.out.println("The tank is empty!");
        }
    }

    public int getCurrentAmountOfFuel() {
        return currentAmountOfFuel;
    }
}

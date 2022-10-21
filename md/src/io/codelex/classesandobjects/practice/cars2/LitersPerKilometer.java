package io.codelex.classesandobjects.practice.cars2;

import java.util.Scanner;

public class LitersPerKilometer {
    static double startKm;
    static double endKm;
    static double liters;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        getKm();
        Car car1 = new Car(startKm);
        fillUpTank();
        car1.fillUp(endKm, liters);
        fillUpTank();
        car1.fillUp(endKm, liters);

        System.out.println("Kilometers per liter are " + car1.calculateConsumption());
        System.out.println("Gas Hog: " + car1.gasHog() + "\nEconomy car: " + car1.economyCar());

        getKm();
        Car car2 = new Car(startKm);
        fillUpTank();
        car2.fillUp(endKm, liters);

        System.out.println("Kilometers per liter are " + car2.calculateConsumption());
        System.out.println("Gas Hog: " + car2.gasHog() + "\nEconomy car: " + car2.economyCar());
    }

    private static void getKm() {
        System.out.print("Enter first reading: ");
        startKm = scanner.nextDouble();
    }

    private static void fillUpTank() {
        System.out.print("Enter km: ");
        endKm = scanner.nextDouble();
        System.out.print("Enter liters: ");
        liters = scanner.nextDouble();
    }

}

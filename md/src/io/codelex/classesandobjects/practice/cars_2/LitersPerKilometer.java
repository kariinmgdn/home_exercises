package io.codelex.classesandobjects.practice.cars_2;

import java.util.Scanner;

public class LitersPerKilometer {
    static double START_KM;
    static double END_KM;
    static double LITERS;
    static Scanner SCAN = new Scanner(System.in);

    public static void main(String[] args) {

        getKm();
        Car car1 = new Car(START_KM);
        fillUpTank();
        car1.fillUp(END_KM, LITERS);
        fillUpTank();
        car1.fillUp(END_KM, LITERS);

        System.out.println("Kilometers per liter are " + car1.calculateConsumption());
        System.out.println("Gas Hog: "+car1.gasHog() + "\nEconomy car: " + car1.economyCar());

        getKm();
        Car car2 = new Car(START_KM);
        fillUpTank();
        car2.fillUp(END_KM, LITERS);

        System.out.println("Kilometers per liter are " + car2.calculateConsumption());
        System.out.println("Gas Hog: "+car2.gasHog() + "\nEconomy car: " + car2.economyCar());
    }

    private static void getKm() {
        System.out.print("Enter first reading: ");
        START_KM = SCAN.nextDouble();
    }

    private static void fillUpTank() {
        System.out.print("Enter km: ");
        END_KM = SCAN.nextDouble();
        System.out.print("Enter liters: ");
        LITERS = SCAN.nextDouble();
    }

}

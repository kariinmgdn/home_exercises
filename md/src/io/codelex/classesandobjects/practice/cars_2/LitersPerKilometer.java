package io.codelex.classesandobjects.practice.cars_2;

import java.util.Scanner;

public class LitersPerKilometer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double startKilometers, endKilometers, liters;

        System.out.print("Enter first reading: ");
        startKilometers = scan.nextDouble();

        System.out.print("Enter second reading: ");
        endKilometers = scan.nextDouble();

        System.out.print("Enter liters consumed: ");
        liters = scan.nextDouble();

        Car car1 = new Car(startKilometers, endKilometers, liters);
        System.out.print("Enter first reading: ");
        startKilometers = scan.nextDouble();

        System.out.print("Enter second reading: ");
        endKilometers = scan.nextDouble();

        System.out.print("Enter liters consumed: ");
        liters = scan.nextDouble();
        Car car2 = new Car(startKilometers, endKilometers, liters);

        System.out.println("Kilometers per liter are " + car1.calculateConsumption());
        System.out.println(car1.gasHog() + "\n" + car1.economyCar());
        System.out.println("Kilometers per liter are " + car2.calculateConsumption());
    }
}

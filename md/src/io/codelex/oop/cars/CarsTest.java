package io.codelex.oop.cars;

public class CarsTest {
    public static void main(String[] args) {
        Car car1 = new Car("kkads", 1995, "zilaas taales", "Mashiina BrumBrum original", "very cool", 30000, 2005, "V12");
        Car car2 = new Car("kkads1", 1995, "frikadelu pienzupa", "Mashiina BrumBrum", "slay", 10200, 1995, "V8");
        Car car3 = new Car("kkads2", 1995, "umpa-lumpas zeme", "Mashiina BrumBrum nr 2", "idk", 20000, 1995, "V12");

        CarService carService = new CarService();
        carService.addCar(car1);
        carService.addCar(car2);
        carService.addCar(car3);

        carService.removeCar(car1);
        System.out.println(carService.getCarsInService());
        carService.addCar(car1);
        System.out.println(carService.getCarsInService());
        System.out.println(carService.producedBefore1999());
        System.out.println(carService.cheapestCar());
        System.out.println(carService.expensiveCar());
        System.out.println(carService.V12Engine());

    }
}

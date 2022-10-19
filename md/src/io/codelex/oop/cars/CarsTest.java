package io.codelex.oop.cars;

import java.util.ArrayList;
import java.util.List;

public class CarsTest {
    public static void main(String[] args) {

        Manufacturer manufacturer1 = new Manufacturer("kkads", 1796, "zilaas taales");
        Manufacturer manufacturer2 = new Manufacturer("kkads1", 1896, "frikadelu pienzupa");
        Manufacturer manufacturer3 = new Manufacturer("kkads2", 1996, "umpa-lumpas zeme");
        Manufacturer manufacturer4 = new Manufacturer("kkads3", 2211, "kkaada saule");

        List<Manufacturer> manufacturerList2 = new ArrayList<>();
        manufacturerList2.add(manufacturer1);
        manufacturerList2.add(manufacturer2);

        List<Manufacturer> manufacturerList4 = new ArrayList<>();
        manufacturerList4.add(manufacturer1);
        manufacturerList4.add(manufacturer2);
        manufacturerList4.add(manufacturer3);
        manufacturerList4.add(manufacturer4);

        Car car1 = new Car("Mashiina BrumBrum original", "very cool", 30000, 2005, manufacturerList2, "V12");
        Car car2 = new Car("Mashiina BrumBrum 2", "slay", 10200, 1995, manufacturerList4, "V8");
        Car car3 = new Car("Mashiina BrumBrum nr 3", "idk", 20000, 1995,manufacturerList4, "V12");


        Car car4 = new Car("Mashiina BrumBrum nr 4000", "idk", 20000, 1995,manufacturerList4, "V12");

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
        System.out.println(carService.atLeast3Manufacturers());
        System.out.println(carService.specificCar(car1));
        System.out.println(carService.specificCar(car4));
        System.out.println(carService.getManufacturerWithTheYearOfEstablishment(2000, ">"));

    }
}

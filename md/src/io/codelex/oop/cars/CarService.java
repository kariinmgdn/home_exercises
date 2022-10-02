package io.codelex.oop.cars;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CarService{
    private List<Car> carsInService = new ArrayList<>();
    private int mostExp = 0;
    private Car mostExpCar;

    private int leastExp = 999999999;
    private Car leastExpCar;

    public void addCar(Car car) {
        carsInService.add(car);
    }

    public void removeCar(Car car) {
        carsInService.remove(car);
    }

    public List<Car> V12Engine() {
        return carsInService.stream()
                .filter(car -> car.getCarEngine().equals(Engine.V12))
                .toList();
    }
    public void sortList(Comparator parameter) {
        //idk
    }

    public List<Car> specificManufacturer(Manufacturer manufacturer) {
        return carsInService.stream()
                .filter(car -> car.getManufacturerList().equals(manufacturer))
                .toList(); //kopumaa also idk
    }

    // also 12. punkts UN PIEVIENOT VAIRAKUS Manufacturer

    public boolean specificCar(Car car) {
        for (Car car1 : carsInService) {
            if(car1.equals(car)) {
                return true;
            }
        }
        return false;
    }

    public List<Car> producedBefore1999() {
        return carsInService.stream()
                .filter(car -> car.getYearOfManufacture()<1999)
                .toList();
    }

    public Car expensiveCar() {
        for (Car car : carsInService) {
            if (car.getPrice() > mostExp) {
                mostExp = car.getPrice();
                mostExpCar = car;
            }
        }
        return mostExpCar;
    }

    public Car cheapestCar() {
        for (Car car : carsInService) {
            if (car.getPrice() < leastExp) {
                leastExp = car.getPrice();
                leastExpCar = car;
            }
        }
        return leastExpCar;
    }

    public List<Car> atLeast3Manufacturers() {
        return carsInService.stream()
                .filter(car -> car.getManufacturerList().size() >= 3)
                .toList();
    }



    public List<Car> getCarsInService() {
        return carsInService;
    }
}

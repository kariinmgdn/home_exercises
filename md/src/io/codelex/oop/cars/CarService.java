package io.codelex.oop.cars;

import java.util.*;

public class CarService{
    private final List<Car> carsInService = new ArrayList<>();
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
    public void sortList(String parameter) {
        if (parameter.equals("ascending")) {
            carsInService.sort(Comparator.comparing(Car::getCarName));
        } else {
            carsInService.sort(Comparator.comparing(Car::getCarName).reversed());
        }
    }

    public List<Car> specificManufacturer(Manufacturer manufacturer) {
        return carsInService.stream()
                .filter(car -> car.getManufacturerList().contains(manufacturer))
                .toList();
    }

    public List<Car> getManufacturerWithTheYearOfEstablishment(int year, String comparator) {
        List<Car> carList = new ArrayList<>();

        for (Car car : carsInService) {
            int i = 0;
            for (Manufacturer manufacturer : car.getManufacturerList()) {
                switch (comparator) {
                    case ("<") -> {
                        if (manufacturer.getYearOfEstablishment() < year) {
                            i++;
                        }
                    }
                    case (">") -> {
                        if (manufacturer.getYearOfEstablishment() > year) {
                            i++;
                        }
                    }
                    case ("=") -> {
                        if (manufacturer.getYearOfEstablishment() == year) {
                            i++;
                        }
                    }
                    case ("<=") -> {
                        if (manufacturer.getYearOfEstablishment() <= year) {
                            i++;
                        }
                    }
                    case (">=") -> {
                        if (manufacturer.getYearOfEstablishment() >= year) {
                            i++;
                        }
                    }
                    case ("!=") -> {
                        if (manufacturer.getYearOfEstablishment() != year) {
                            i++;
                        }
                    }
                }
            }
            if (i>0) {
                carList.add(car);
            }
        }
        return carList;
    }

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

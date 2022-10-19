package io.codelex.oop.cars;

import java.util.List;
import java.util.Objects;

public class Car {
    private final String carName;
    private final String model;
    private final int price;
    private final int yearOfManufacture;
    private final List<Manufacturer> manufacturerList;
    private final Engine carEngine;

    public Car(String carName, String model, int price, int yearOfManufacture, List<Manufacturer> manufacturerList, String carEngine) {
        this.carName = carName;
        this.model = model;
        this.price = price;
        this.yearOfManufacture = yearOfManufacture;
        this.manufacturerList = manufacturerList;
        this.carEngine = Engine.valueOf(carEngine);
    }




    public String getCarName() {
        return carName;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public List<Manufacturer> getManufacturerList() {
        return manufacturerList;
    }

    public Engine getCarEngine() {
        return carEngine;
    }

    public String toString() {
        return getCarName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return price == car.price && yearOfManufacture == car.yearOfManufacture && carName.equals(car.carName) && model.equals(car.model) && manufacturerList.equals(car.manufacturerList) && carEngine == car.carEngine;
    }

    @Override
    public int hashCode() {
        return Objects.hash(carName, model, price, yearOfManufacture, manufacturerList, carEngine);
    }


}

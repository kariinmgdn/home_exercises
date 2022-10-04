package io.codelex.oop.cars;

import java.util.List;

public class Car extends Manufacturer {
    private final String carName;
    private final String model;
    private final int price;
    private final int yearOfManufacture;
    private List<Manufacturer> manufacturerList;

    private final Engine carEngine;

    public Car(String name, int yearOfEstablishment, String country, String carName,
               String model, int price, int yearOfManufacture, String carEngine) {
        super(name, yearOfEstablishment, country);
        this.carName = carName;
        this.model = model;
        this.price = price;
        this.yearOfManufacture = yearOfManufacture;
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
    public void equals() {

    }

    @Override
    public int hashCode() {
        return 0;
    }
}

package io.codelex.oop.cars;

import java.util.List;

public abstract class Manufacturer {

    private String name;
    private int yearOfEstablishment;
    private String country;

    public Manufacturer(String name, int yearOfEstablishment, String country) {
        this.name = name;
        this.yearOfEstablishment = yearOfEstablishment;
        this.country = country;
    }
    public abstract void equals();
    public abstract int hashCode();
}

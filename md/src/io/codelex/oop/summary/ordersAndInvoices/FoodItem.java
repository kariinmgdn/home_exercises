package io.codelex.oop.summary.ordersAndInvoices;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FoodItem extends AbstractItem{

    private final LocalDate dateOfExpiration;

    public FoodItem(String name, double price, int day, int month, int year) {
        super(name, price);
        this.dateOfExpiration = LocalDate.of(year,month,day);
    }

    @Override
    public String name() {
        return getName();
    }

    @Override
    public double price() {
        return getPrice();
    }

    @Override
    public String fullInfo() {
        return getName() + getPrice() + getDateOfExpiration();
    }

    @Override
    public String toString() {
        return name() + ", " + price() + " EUR, best before " +
                getDateOfExpiration().format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }

    public LocalDate getDateOfExpiration() {
        return dateOfExpiration;
    }
}

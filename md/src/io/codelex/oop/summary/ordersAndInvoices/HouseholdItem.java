package io.codelex.oop.summary.ordersAndInvoices;

public class HouseholdItem extends AbstractItem{
    private final String color;
    public HouseholdItem(String name, double price, String color) {
        super(name, price);
        this.color = color;
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
        return name() + price() + getColor();
    }

    public String toString() {
        return name() + ", " + price() + " EUR, color: " + getColor();
    }

    public String getColor() {
        return color;
    }
}

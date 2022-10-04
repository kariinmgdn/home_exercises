package io.codelex.oop.summary.ordersAndInvoices;

public class ElectronicsItem extends AbstractItem{

    private final int watts;
    public ElectronicsItem(String name, double price, int watts) {
        super(name, price);
        this.watts = watts;
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
        return name() + price() + getWatts();
    }

    public String toString() {
        return name() + ", " + price() + " EUR, power: " + getWatts() + " (W)";
    }

    public int getWatts() {
        return watts;
    }
}

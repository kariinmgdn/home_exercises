package io.codelex.polymorphism.practice.exercise4;

public class Commission extends Hourly{

    private double totalSales;
    private double commissionRate;
    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commissionRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commissionRate = commissionRate;
    }

    public void addSales (double sales) {
        totalSales+=sales;
    }

    @Override
    public double pay() {
        return super.pay() + totalSales;
    }

    @Override
    public String toString() {
        return super.toString() + " " + totalSales;
    }
}

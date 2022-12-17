package io.codelex.classesandobjects.practice.products_1;

public class Product {

    private String name;
    private double priceAtStart;
    private int amountAtStart;


    public void setPriceAtStart(double priceAtStart) {
        this.priceAtStart = priceAtStart;
    }

    public void setAmountAtStart(int amountAtStart) {
        this.amountAtStart = amountAtStart;
    }

    public Product(String name, double priceAtStart, int amountAtStart) {
        this.name = name;
        this.priceAtStart = priceAtStart;
        this.amountAtStart = amountAtStart;
    }

    public void printProduct() {
        System.out.println(name + ", price " + priceAtStart + ", amount " + amountAtStart);
    }
}


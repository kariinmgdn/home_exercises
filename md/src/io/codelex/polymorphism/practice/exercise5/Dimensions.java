package io.codelex.polymorphism.practice.exercise5;

public enum Dimensions {

    A4(1, "A4"),
    A3(2, "A3"),
    A2(3, "A2"),
    A1(4, "A1");

    private final int cost;
    private final String dimensions;

    Dimensions(int cost, String dimensions) {
        this.cost = cost;
        this.dimensions = dimensions;
    }

    public int getCost() {
        return cost;
    }

    public String getDimensions() {
        return dimensions;
    }
}

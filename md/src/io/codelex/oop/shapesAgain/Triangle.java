package io.codelex.oop.shapesAgain;

public class Triangle extends Shape2 {

    private final double base;

    public Triangle(double base) {
        this.base = base;
    }

    @Override
    public double calculatePerimeter() {
        return 3 * getBase();
    }

    @Override
    public double calculateArea() {
        return Math.pow(getBase(), 2) * Math.sqrt(3) / 4;
    }

    public String toString() {
        return "Triangle area: " + calculateArea() +
                "\nTriangle perimeter: " + calculatePerimeter();
    }

    public double getBase() {
        return base;
    }

}

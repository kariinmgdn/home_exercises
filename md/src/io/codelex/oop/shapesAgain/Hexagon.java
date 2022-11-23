package io.codelex.oop.shapesAgain;

public class Hexagon extends Shape2 {

    private final double side;

    public Hexagon(double side) {
        this.side = side;
    }

    @Override
    public double calculatePerimeter() {
        return 6 * getSide();
    }

    @Override
    public double calculateArea() {
        return 3 * Math.sqrt(3) / 2 * Math.pow(getSide(), 2);
    }

    public String toString() {
        return "Hexagon area: " + calculateArea() +
                "\nHexagon perimeter: " + calculatePerimeter();
    }

    public double getSide() {
        return side;
    }
}

package io.codelex.oop.shape3D;

public class Cube extends Shape3D {

    private final double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double calculatePerimeter() {
        return 12 * getSide();
    }

    @Override
    public double calculateArea() {
        return 6 * Math.pow(getSide(), 2);
    }

    @Override
    public double calculateVolume() {
        return Math.pow(getSide(), 3);
    }

    public String toString() {
        return "Cube perimeter " + calculatePerimeter() + ", area " + calculateArea() + ", volume " + calculateVolume();
    }

    public double getSide() {
        return side;
    }
}

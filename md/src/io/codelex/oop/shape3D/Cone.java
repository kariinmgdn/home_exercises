package io.codelex.oop.shape3D;

public class Cone extends Shape3D {

    private final double radius;
    private final double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * getRadius();
    }

    @Override
    public double calculateArea() {
        return Math.PI * getRadius() * (getRadius() + Math.sqrt(Math.pow(getHeight(), 2) + Math.pow(getRadius(), 2)));
    }

    @Override
    public double calculateVolume() {
        return Math.PI * Math.pow(radius, 2) * getHeight() / 3;
    }

    public String toString() {
        return "Cone perimeter " + calculatePerimeter() + ", area " + calculateArea() + ", volume " + calculateVolume();
    }

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }
}

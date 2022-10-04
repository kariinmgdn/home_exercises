package io.codelex.oop.shapesAgain;

public class Rectangle extends Shape2{

    private final double height;
    private final double wight;

    public Rectangle(double height, double wight) {
        this.height = height;
        this.wight = wight;
    }

    @Override
    public double calculatePerimeter() {
        return 2*(getHeight()+getWight());
    }

    @Override
    public double calculateArea() {
        return getHeight()*getWight();
    }

    public String toString() {
        return "Rectangle area: " + calculateArea() +
                "\nRectangle perimeter: " + calculatePerimeter();
    }

    public double getHeight() {
        return height;
    }

    public double getWight() {
        return wight;
    }
}

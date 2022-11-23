package io.codelex.oop.shapes;

public class Rectangle extends Shape {
    private final int width;
    private final int heigth;

    public Rectangle(int numSides, int width, int heigth) {
        super(numSides);
        this.width = width;
        this.heigth = heigth;
    }

    @Override
    public int getNumSides() {
        return 4;
    }

    @Override
    public void getArea() {
        int area = width * heigth;
        System.out.println("The area of a rectangle is " + area);
    }

    @Override
    public void getPerimeter() {
        int perimeter = 2 * (width + heigth);
        System.out.println("The perimeter of a rectangle is " + perimeter);
    }
}

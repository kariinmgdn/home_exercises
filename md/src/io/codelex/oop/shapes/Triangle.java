package io.codelex.oop.shapes;

public class Triangle extends Shape {
    private final int width;
    private final int height;

    public Triangle(int numSides, int width, int heigth) {
        super(numSides);
        this.width = width;
        this.height = heigth;
    }

    @Override
    public int getNumSides() {
        return 3;
    }

    @Override
    public void getArea() {
        double area = (double) (width * height) / 2;
        System.out.println("The area of a triangle is " + area);
    }

    @Override
    public void getPerimeter() {
        int perimeter = width * 3;
        System.out.println("The perimeter of a triangle is " + perimeter);
    }
}

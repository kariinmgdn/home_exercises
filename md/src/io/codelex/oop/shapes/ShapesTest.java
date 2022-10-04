package io.codelex.oop.shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4,3,4);
        rectangle.getArea();
        rectangle.getPerimeter();

        Triangle triangle = new Triangle(3,4,4);
        triangle.getArea();
        triangle.getPerimeter();
    }
}

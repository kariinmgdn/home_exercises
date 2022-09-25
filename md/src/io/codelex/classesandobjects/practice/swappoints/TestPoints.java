package io.codelex.classesandobjects.practice.swappoints;

public class TestPoints {

    public static void main(String[] args) {
        Point p1 = new Point(-3, 1);
        Point p2 = new Point(2, 4);
        swapPoints(p1, p2);
        System.out.println("(" + p1.x + ", " + p1.y + ")");
        System.out.println("(" + p2.x + ", " + p2.y + ")");
    }

    public static void swapPoints(Point p1, Point p2) {
        int p = p1.x;
        int pp = p1.y;
        p1.x = p2.x;
        p1.y = p2.y;
        p2.x = p;
        p2.y = pp;
    }
}

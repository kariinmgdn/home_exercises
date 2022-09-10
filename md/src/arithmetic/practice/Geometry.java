package io.codelex.arithmetic.practice;

import io.codelex.NoCodeWrittenException;

import java.math.BigDecimal;

class Geometry {
    static double areaOfCircle(BigDecimal radius) {
        double r = radius.doubleValue();
        if (r > 0) {
            double area = Math.PI * r * r;
            return area;
        }
        System.out.println("error");
        return 0;
    }

    static double areaOfRectangle(BigDecimal length, BigDecimal width) {
        double l = length.doubleValue();
        double w = width.doubleValue();
        if (l > 0 || w > 0 ) {
            double area = l * w;
            return area;
        }
        System.out.println("error");
        return 0;

    }

    static double areaOfTriangle(BigDecimal base, BigDecimal h) {
        double b = base.doubleValue();
        double x = h.doubleValue();
        if (b > 0 || x > 0) {
            double area = b * x * 0.5;
            return area;
        }
        System.out.println("error");
        return 0;
    }
}

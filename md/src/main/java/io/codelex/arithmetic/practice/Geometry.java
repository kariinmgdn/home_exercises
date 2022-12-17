package io.codelex.arithmetic.practice;

import io.codelex.NoCodeWrittenException;

import java.math.BigDecimal;

class Geometry {
    static double areaOfCircle(BigDecimal radius) {
        double r = radius.doubleValue();
        return Math.PI * r * r;
    }

    static double areaOfRectangle(BigDecimal length, BigDecimal width) {
        double l = length.doubleValue();
        double w = width.doubleValue();
        return l * w;

    }

    static double areaOfTriangle(BigDecimal base, BigDecimal h) {
        double b = base.doubleValue();
        double x = h.doubleValue();
        return b * x * 0.5;

    }
}

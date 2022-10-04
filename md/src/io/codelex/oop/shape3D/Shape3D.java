package io.codelex.oop.shape3D;

import io.codelex.oop.shapesAgain.Shape2;

public abstract class Shape3D extends Shape2 {
    @Override
    public abstract double calculatePerimeter();

    @Override
    public abstract double calculateArea();

    public abstract double calculateVolume();
}

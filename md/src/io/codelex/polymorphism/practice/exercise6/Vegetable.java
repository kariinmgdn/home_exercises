package io.codelex.polymorphism.practice.exercise6;

public class Vegetable extends Food{


    protected Vegetable(String type, int quantity) {
        super(type, quantity);
    }

    @Override
    public String getType() {
        return super.getType();
    }

    @Override
    public int getQuantity() {
        return super.getQuantity();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

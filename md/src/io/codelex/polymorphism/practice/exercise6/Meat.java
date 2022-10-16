package io.codelex.polymorphism.practice.exercise6;

public class Meat extends Food{


    protected Meat(String type, int quantity) {
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
}

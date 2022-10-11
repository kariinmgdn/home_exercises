package io.codelex.polymorphism.practice.exercise6;

public abstract class Food {
    private final String type;
    private final int quantity;

    protected Food(String type, int quantity) {
        this.type = type;
        this.quantity = quantity;
    }


    public String getType() {
        return type;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString(){ return getType() + " " + getQuantity();
    }
}

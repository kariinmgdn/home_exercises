package io.codelex.basket;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Basket <T> {
    List<T> basket = new ArrayList<>();

    private final T item;
    private Supplier<T> functionToCreate;

    public Basket(T item) {
        this.item = item;
    }

    public void addToBasket() {
        if (basket.size() > 9) {
            throw new BasketFullException("Basket is already full!");
        } else {
            basket.add(item);
        }
    }

    public void removeFromBasket() {
        if (basket.size() == 0) {
            throw new BasketEmptyException("Basket is empty!");
        } else {
            basket.remove(item);
        }
    }

    @Override
    public String toString() {
        return "Basket: " + basket.size();
    }
}

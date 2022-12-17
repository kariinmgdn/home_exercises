package io.codelex.test.basket;

import java.util.ArrayList;
import java.util.List;

public class Basket<T> {
    List<T> basket = new ArrayList<>();

    public Basket() {
    }

    public void addToBasket(T item) {
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
            basket.remove(basket.size() - 1);
        }
    }

    @Override
    public String toString() {
        return "Basket: " + basket.size();
    }
}

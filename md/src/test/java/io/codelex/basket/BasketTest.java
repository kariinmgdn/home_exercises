package io.codelex.basket;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasketTest {
    @Test
    void testApplesInBasket() {
        Basket<Apple> basket = new Basket<>(new Apple());
        basket.addToBasket();
        basket.addToBasket();
        Assertions.assertEquals("Basket: 2", basket.toString());
    }
    @Test
    void testMushroomsInBasket() {
        Basket<Mushroom> basket = new Basket<>(new Mushroom());
        basket.addToBasket();
        basket.addToBasket();
        Assertions.assertEquals("Basket: 2", basket.toString());
    }
    @Test
    void testException() {
        Basket<Apple> basket = new Basket<>(new Apple());
    }
}

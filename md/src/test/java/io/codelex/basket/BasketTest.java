package io.codelex.basket;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasketTest {
    @Test
    void testApplesInBasket() {
        Basket<Apple> basket = new Basket<>();
        basket.addToBasket(new Apple());
        basket.addToBasket(new Apple());
        Assertions.assertEquals("Basket: 2", basket.toString());
    }
    @Test
    void testMushroomsInBasket() {
        Basket<Mushroom> basket = new Basket<>();
        basket.addToBasket(new Mushroom());
        basket.addToBasket(new Mushroom());
        Assertions.assertEquals("Basket: 2", basket.toString());
    }
    @Test
    void testException() throws BasketEmptyException {
        Basket<Apple> basket = new Basket<>();
        Assertions.assertThrows(BasketEmptyException.class, basket::removeFromBasket);
    }
}

package io.codelex.basket;

public class BasketEmptyException extends RuntimeException{

    public BasketEmptyException(String message) {
        super(message);
    }
}

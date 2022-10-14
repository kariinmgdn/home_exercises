package io.codelex.bankCards;

public class NotEnoughFundsException extends RuntimeException{

    public NotEnoughFundsException(String message) {
        super(message);
    }
}

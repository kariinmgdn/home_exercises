package io.codelex.test.bankCards;

public class NotEnoughFundsException extends RuntimeException{

    public NotEnoughFundsException(String message) {
        super(message);
    }
}

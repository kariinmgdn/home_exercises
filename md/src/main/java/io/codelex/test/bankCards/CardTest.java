package io.codelex.test.bankCards;

public class CardTest {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard(123, "John Smith", "045", 400);
        DebitCard debitCard = new DebitCard(456, "Lisa Brown", "098", 5000);

        creditCard.add(100);
        creditCard.take(400);
        creditCard.take(50);
        System.out.println(creditCard);

        debitCard.add(5050);
        System.out.println(debitCard);
    }
}

package io.codelex.bankCards;

public class Cards {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard(123, "Anna", "012", 100);
        DebitCard debitCard = new DebitCard(111, "Panna", "000", 100);
        creditCard.addMoney(1000);
        creditCard.takeMoney(1101);
        System.out.println(creditCard);
    }
}

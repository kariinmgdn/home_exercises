package io.codelex.test.bankCards;

public class CreditCard extends Card {
    protected CreditCard(int number, String name, String ccvCode, double balance) {
        super(number, name, ccvCode, balance);
    }

    @Override
    public void take(double amount) {
        super.take(amount);
        if (getBalance() < 100) {
            System.out.println("Warning: Low funds!");
        }
    }
}

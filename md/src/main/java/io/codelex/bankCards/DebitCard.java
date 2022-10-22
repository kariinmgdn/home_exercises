package io.codelex.bankCards;

public class DebitCard extends Card {

    protected DebitCard(int number, String name, String ccvCode, double balance) {
        super(number, name, ccvCode, balance);
    }

    @Override
    public void add(double amount) {
        super.add(amount);
        if (getBalance() > 10000) {
            System.out.println("Warning: Too much money!");
        }
    }
}

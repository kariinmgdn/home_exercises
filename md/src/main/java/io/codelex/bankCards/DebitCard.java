package io.codelex.bankCards;

public class DebitCard extends Card{
    private double balance;

    public DebitCard(int number, String name, String CCVcode, double balance) {
        super(number, name, CCVcode);
        this.balance = balance;
    }

    @Override
    public void addMoney(double value) {
        balance+=value;
        if (balance > 10000) {
            System.out.println("Warning: Too much money");
        }
    }

    @Override
    public void takeMoney(double value) {
        if (value > balance) {
            throw new NotEnoughFundsException("Not enough money!");
        } else {
            balance-=value;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", balance: " + balance;
    }
}

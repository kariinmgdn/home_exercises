package io.codelex.bankCards;

public class CreditCard extends Card{

    private double balance;

    public CreditCard(int number, String name, String CCVcode, double balance) {
        super(number, name, CCVcode);
        this.balance = balance;
    }

    @Override
    public void addMoney(double value) {
        balance+=value;
    }

    @Override
    public void takeMoney(double value) {
        if (value > balance) {
            throw new NotEnoughFundsException("Not enough money!");
        } else {
            balance-=value;
        }
        if (balance < 100) {
            System.out.println("Warning: Low funds");
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", balance: " + balance;
    }
}

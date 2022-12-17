package io.codelex.test.bankCards;

public abstract class Card {
    private final int number;
    private final String name;
    private final String ccvCode;
    private double balance;

    protected Card(int number, String name, String ccvCode, double balance) {
        this.number = number;
        this.name = name;
        this.ccvCode = ccvCode;
        this.balance = balance;
    }

    public void add(double amount) {
        balance += amount;
    }

    public void take(double amount) {
        if (amount > getBalance()) {
            throw new NotEnoughFundsException("Not enough funds!");
        } else {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Card{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", ccvCode='" + ccvCode + '\'' +
                ", balance=" + balance +
                '}';
    }
}

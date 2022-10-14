package io.codelex.bankCards;

public abstract class Card {

    private final int number;
    private final String name;
    private final String CCVcode;

    public Card(int number, String name, String CCVcode) {
        this.number = number;
        this.name = name;
        this.CCVcode = CCVcode;
    }

    public abstract void addMoney(double value);
    public abstract void takeMoney(double value);

    @Override
    public String toString() {
        return "number=" + number +
                ", name='" + name +
                ", CCVcode=" + CCVcode;
    }
}

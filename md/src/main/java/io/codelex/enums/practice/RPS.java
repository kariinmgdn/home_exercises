package main.java.io.codelex.enums.practice;

public enum RPS {

    ROCK("Rock"),
    PAPER("Paper"),
    SCISSORS("Scissors");

    private final String names;

    RPS(String names) {
        this.names = names;
    }

    @Override
    public String toString() {
        return names;
    }
}

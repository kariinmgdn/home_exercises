package io.codelex.enums.practice;

public enum Exercise1 {

    NORTH("North", "0", "up"),
    SOUTH("South", "1", "down"),
    EAST("East", "2", "right"),
    WEST("West", "3", "left");

    private final String directions1;
    private final String directions2;
    private final String directions;

    Exercise1(String directions, String directions2, String directions1) {
        this.directions = directions;
        this.directions1 = directions1;
        this.directions2 = directions2;
    }

    @Override
    public String toString() {
        return directions + ":" + directions1 + ":" + directions2;
    }
}

package io.codelex.classesandobjects.practice.swappoints;

public class SwapPoints {

    private int x;
    private int y;

    public SwapPoints(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String swaPoints() {
        return "(" + this.x + ", " + this.y + ")";
    }
}

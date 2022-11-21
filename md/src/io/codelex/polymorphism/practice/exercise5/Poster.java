package io.codelex.polymorphism.practice.exercise5;

public class Poster extends Advert {
    private final int numberOfCopies;
    private final int costPerCopy;
    private final Dimensions dimensions;

    public Poster(int fee, int numberOfCopies, int costPerCopy, Dimensions dimensions) {
        super(fee);
        this.numberOfCopies = numberOfCopies;
        this.costPerCopy = costPerCopy;
        this.dimensions = dimensions;
    }

    @Override
    public int cost() {
        return super.cost() + numberOfCopies * costPerCopy * dimensions.getCost();
    }

    @Override
    public String toString() {
        return "\nPoster: " +
                "numberOfCopies=" + numberOfCopies +
                ", costPerCopy=" + costPerCopy +
                ", dimensions=" + dimensions.getDimensions();
    }
}

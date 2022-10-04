package io.codelex.oop.computers;

import java.util.Objects;

public class Computer {

    private final String processor;
    private final String ram;
    private final String graphicsCard;
    private final String company;
    private final String model;

    public Computer(String processor, String ram, String graphicsCard,
                    String company, String model) {
        this.processor = processor;
        this.ram = ram;
        this.graphicsCard = graphicsCard;
        this.company = company;
        this.model = model;
    }

    public boolean equals(Computer computer) {
        if (hashCode() == computer.hashCode()) {
            return true;
        }
        return false;
    }

    public String toString() {
        return getCompany() + ": " + getModel() + " (" + getProcessor() + ", " +
                getRam() + ", " + getGraphicsCard() + ")";
    }

    @Override
    public int hashCode() {
        return Objects.hash(processor, ram, graphicsCard, company, model);
    }

    public String getProcessor() {
        return processor;
    }

    public String getRam() {
        return ram;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public String getCompany() {
        return company;
    }

    public String getModel() {
        return model;
    }
}

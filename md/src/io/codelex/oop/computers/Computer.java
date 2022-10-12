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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return processor.equals(computer.processor) && ram.equals(computer.ram) && graphicsCard.equals(computer.graphicsCard) && company.equals(computer.company) && model.equals(computer.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processor, ram, graphicsCard, company, model);
    }

    public String toString() {
        return getCompany() + ": " + getModel() + " (" + getProcessor() + ", " +
                getRam() + ", " + getGraphicsCard() + ")";
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

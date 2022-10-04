package io.codelex.classesandobjects.practice.dog_7;

public class Dog {
    private final String name;
    private final String sex;
    private String father;
    private final String mother;

    public Dog(String name, String sex, String father, String mother) {
        this.name = name;
        this.sex = sex;
        this.father = father;
        this.mother = mother;
    }

    public String dogs() {
        return this.name + ", " + this.sex + ", " + fathersName();
    }

    public String fathersName() {
        if (father == null) {
            this.father = "Unknown";
        }
        return this.father;
    }

    public boolean hasSameMotherAs(Dog otherDog) {
        return mother.equals(otherDog.mother);
    }
}

package io.codelex.classesandobjects.practice.dog7;

public class Dog {
    private final String name;
    private final String sex;
    private String father;
    private String mother;

    public Dog(String name, String sex, String father, String mother) {
        this.name = name;
        this.sex = sex;
        this.father = father;
        this.mother = mother;
    }

    public Dog(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public String dogs() {
        return name + ", " + sex + ", " + fathersName();
    }

    public String fathersName() {
        if (father == null) {
            father = "Unknown";
        }
        return father;
    }

    public boolean hasSameMotherAs(Dog otherDog) {
        return mother.equals(otherDog.mother);
    }
}

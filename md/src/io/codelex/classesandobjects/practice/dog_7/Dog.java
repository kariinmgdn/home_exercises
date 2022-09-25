package io.codelex.classesandobjects.practice.dog_7;

public class Dog {
    private String name;
    private String sex;
    private String father;
    private String mother;

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
        if (mother.equals(otherDog.mother)) {
            return true;
        }
        return false;
    }
}

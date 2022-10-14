package io.codelex.generics.practice.exercise1;

public class Exercise1Test {
    public static void main(String[] args) {
    Exercise1<Object> exercise1 = new Exercise1<>();
    exercise1.add(0, 1);
    exercise1.add(1, "s");
        System.out.println(exercise1.concatenate());
    }
}

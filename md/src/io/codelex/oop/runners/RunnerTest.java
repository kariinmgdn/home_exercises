package io.codelex.oop.runners;

public class RunnerTest {
    public static void main(String[] args) {
        Runner runner = Runner.getFitnessLevel(400);
        System.out.println(Runner.getFitnessLevel(200));
        System.out.println(runner);
        System.out.println(Runner.getFitnessLevel(700));
    }

}

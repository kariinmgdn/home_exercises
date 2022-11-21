package io.codelex.polymorphism.practice.exercise6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnimalTest {
    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while ( true ) {
             String[] input = sc.nextLine().split(" ");
            Animal animal = null;

            if (input[0].equals("End")) {
                System.out.println(animals);
                System.exit(0);
            } else if (input[0].equals("Cat")) {
                animal = new Cat(input[1], input[0], Double.valueOf(input[2]), input[3], input[4]);
            } else {
                switch (input[0]) {
                    case "Mouse" -> animal = new Mouse(input[1], input[0], Double.valueOf(input[2]), input[3]);
                    case "Tiger" -> animal = new Tiger(input[1], input[0], Double.valueOf(input[2]), input[3]);
                    case "Zebra" -> animal = new Zebra(input[1], input[0], Double.valueOf(input[2]), input[3]);
                }
            }
            assert animal != null;
            animal.makeSound();
            String[] foodInput = sc.nextLine().split(" ");
            Food food;
            if (Meat.class.getSimpleName().equals(foodInput[0])) {
                food = new Meat(foodInput[0], Integer.parseInt(foodInput[1]));
            } else {
                food = new Vegetable(foodInput[0], Integer.parseInt(foodInput[1]));
            }
            animal.eatFood(food);
            animals.add(animal);
            System.out.println(animal);
        }
    }
}

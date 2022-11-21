package io.codelex.polymorphism.practice.exercise1;

import java.util.ArrayList;
import java.util.List;

/**
 * Take a look at the cars in this package.
 * 1. Extract common behaviour to an interface called Car, and use it in the all classes.
 * Which methods will be extracted with an empty body, and which can be default?
 * 2. Create two more cars of your own choice.
 * 3. As you see there is a possibility to use some kind of boost in Lexus, extract it to a new interface and add that behaviour in one more car.
 * 3. Create one instance of an each car and add them to list.
 * 4. Iterate over the list 10 times, in the 3rd iteration use speed boost on the car if they have one.
 * 5. Print out the car name and speed of the fastest car
 */
public class DragRace {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        NewCar newCar = new NewCar();
        AnotherCar anotherCar = new AnotherCar();
        Audi audi = new Audi();
        Bmw bmw = new Bmw();
        Lexus lexus = new Lexus();
        Tesla tesla = new Tesla();
        cars.add(newCar);
        cars.add(anotherCar);
        cars.add(audi);
        cars.add(bmw);
        cars.add(lexus);
        cars.add(tesla);

        int i = 0;
        int fastest = 0;
        Car fastestCar = null;

        while (i < 10) {
            for (Car car : cars) {
                car.speedUp();
                if (i == 3) {
                    if (car instanceof Boost) {
                        ((Boost) car).useNitrousOxideEngine();
                    }

                }
                if (car.showCurrentSpeed() > fastest) {
                    fastestCar = car;
                    fastest = car.showCurrentSpeed();
                }
            }
            i++;
        }


        System.out.println(fastestCar);
    }
}

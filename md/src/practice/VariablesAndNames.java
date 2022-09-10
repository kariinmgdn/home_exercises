package io.codelex.practice;

public class VariablesAndNames {
    public static void main(String[] args) {

        int cars = 100; //cars
        int seatsInACar = 4; //seats in a car
        int drivers = 30; // drivers
        int passengers = 90; // passengers
        int carsNotDriven = cars - drivers; // free cars
        int carsDriven = drivers; // cars driven at the moment
        int carpoolCapacity = carsDriven * seatsInACar; // carpool capacity
        double averagePassengersPerCar = passengers / carsDriven; // average passengers per car

        System.out.println("There are " + cars + " cars available.");
        System.out.println("There are only " + drivers + " drivers available.");
        System.out.println("There will be " + carsNotDriven + " empty cars today.");
        System.out.println("We can transport " + carpoolCapacity + " people today.");
        System.out.println("We have " + passengers + " to carpool today.");
        System.out.println("We need to put about " + averagePassengersPerCar + " in each car.");
    }
}
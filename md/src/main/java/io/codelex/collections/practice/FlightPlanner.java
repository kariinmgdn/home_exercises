package main.java.io.codelex.collections.practice;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class FlightPlanner {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "C:\\Users\\karin\\home_exercises\\home_exercises\\md\\src\\main\\resources\\collections\\flights.txt";
    static Map<String, HashSet<String>> flights = new HashMap<>();

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> allCities = new ArrayList<>();
        String firstCity;
        String nextCity;
        addAllCities();

        while (true) {
            System.out.println("What would you like to do:\nTo display list of the cities press 1\n"
                    + "To exit program press #");
            String input = scanner.nextLine();
            if (input.equals("1")) {
                while (true) {
                    System.out.println(flights.keySet());
                    System.out.println("Chose your current city: ");
                    firstCity = scanner.nextLine();
                    if (flights.containsKey(firstCity)) {
                        allCities.add(firstCity);
                        nextCity = firstCity;
                        break;
                    }
                }
                while (true) {
                    System.out.println("Chose next city!");
                    Set<String> availableCities = flights.get(nextCity);
                    System.out.println("List of available cities: " + availableCities);
                    String city = scanner.nextLine();
                    while (!availableCities.contains(city)) {
                        System.out.println("Try Again!");
                        city = scanner.nextLine();
                    }
                    allCities.add(city);
                    nextCity = city;
                    if (nextCity.equals(firstCity)) {
                        System.out.println(allCities);
                        System.exit(0);
                    }
                }
            } else if (input.equals("#")) {
                System.exit(0);
            }
        }

    }

    private static void addAllCities() throws IOException {
        final Path path = Paths.get(file);
        Files.readAllLines(path, charset);

        flights = new HashMap<>();
        for (String city : Files.readAllLines(path, charset)) {
            String[] cities = city.split(" -> ");
            String startCity = cities[0];
            String endCity = cities[1];
            if (!flights.containsKey(startCity)) {
                flights.put(startCity, new HashSet<>());
                flights.get(startCity).add(endCity);
            } else {
                flights.get(startCity).add(endCity);
            }
        }
    }
}

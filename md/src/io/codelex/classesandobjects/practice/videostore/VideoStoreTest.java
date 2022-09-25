package io.codelex.classesandobjects.practice.videostore;

import java.util.Scanner;

public class VideoStoreTest {
    private static final int COUNT_OF_MOVIES = 3;
    private static final VideoStore ALL_VIDEOS = new VideoStore();

    public static void main(String[] args) {
        final Scanner keyboard = new Scanner(System.in);

        while (true) {
            ALL_VIDEOS.inventory();
            System.out.println();
            System.out.println("Choose the operation you want to perform ");
            System.out.println("Choose 0 for EXIT");
            System.out.println("Choose 1 to fill video store");
            System.out.println("Choose 2 to rent video (as user)");
            System.out.println("Choose 3 to return video (as user)");

            int n = keyboard.nextInt();

            switch (n) {
                case 0 -> System.exit(0);
                case 1 -> fillVideoStore(keyboard);
                case 2 -> rentVideo(keyboard);
                case 3 -> returnVideo(keyboard);
                default -> {
                }
            }

        }
    }

    private static void fillVideoStore(Scanner scanner) {
        for (int i = 0; i < COUNT_OF_MOVIES; i++) {
            scanner.nextLine();
            System.out.println("Enter movie name");
            String movieName = scanner.nextLine();
            ALL_VIDEOS.addVideo(movieName);
            System.out.println("Enter rating");
            int rating = scanner.nextInt();
            while (rating>5 || rating<1) {
                System.out.println("Please rate the movie 1-5");
                rating = scanner.nextInt();
            }
            ALL_VIDEOS.usersRating(movieName,rating);
        }
    }

    private static void rentVideo(Scanner scanner) {
        scanner.nextLine();
        String movie = scanner.nextLine();
        ALL_VIDEOS.checkOut(movie);
    }

    private static void returnVideo(Scanner scanner) {
        scanner.nextLine();
        String name = scanner.nextLine();
        ALL_VIDEOS.returnVideo(name);
        int rating = scanner.nextInt();
        while (rating>5 || rating<1) {
            System.out.println("Please rate the movie 1-5");
            rating = scanner.nextInt();
        }
        ALL_VIDEOS.usersRating(name,rating);
    }
}

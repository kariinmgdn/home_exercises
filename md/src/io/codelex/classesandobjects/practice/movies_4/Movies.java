package io.codelex.classesandobjects.practice.movies_4;

import java.util.ArrayList;
import java.util.List;

public class Movies {
    public static void main(String[] args) {
        List<Movie> allMovies = new ArrayList<>();
        allMovies.add(new Movie("Casino Royale", "Eon Productions", "PG13"));
        allMovies.add(new Movie("Glass", "Buena Vista International", "PG"));
        allMovies.add(new Movie("Spider-Man: Into the Spider-Verse", "Columbia Pictures", "PG"));
        List<Movie> onlyPG = getPG(allMovies);
        System.out.println("Only PG movies");
        System.out.println(onlyPG);
    }

    private static List<Movie> getPG(List<Movie> movieList) {
        List<Movie> PGMovies = new ArrayList<>();
        for (Movie PGMovie : movieList) {
            if (PGMovie.isPG()) {
                PGMovies.add(PGMovie);
            }
        }
        return PGMovies;
    }

}

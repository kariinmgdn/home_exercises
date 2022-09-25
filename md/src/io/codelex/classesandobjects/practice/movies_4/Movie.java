package io.codelex.classesandobjects.practice.movies_4;

public class Movie {
    private final String title;
    private final String studio;
    private String rating;

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
    }

    public boolean isPG() {
        if (rating.equals("PG")) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "title: " + title + " ,studio: " + studio;
    }
}

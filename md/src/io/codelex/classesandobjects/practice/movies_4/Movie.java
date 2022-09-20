package io.codelex.classesandobjects.practice.movies_4;


public class Movie {
    private String title;
    private String studio;
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

    public String[] getPG(String title, String studio, String rating) {
        String[] pgMovies = new String[1];
        if (this.rating.equals("PG")) {

        }
        return pgMovies;
    }
}

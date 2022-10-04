package io.codelex.classesandobjects.practice.videostore;

public class Video {

    private final String name;
    private boolean isCheckedOut;
    private double rating;
    private int lastRatings = 0;
    private int percentage;
    private int i = 0;


    public Video(String name) {
        this.name = name;
        this.isCheckedOut = false;
        this.rating = 0;
        this.percentage = 0;
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public int getPercentage() {
        return percentage;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void checkedOut() {
        isCheckedOut = true;
    }

    public void returned() {
        isCheckedOut = false;
    }

    public void receiveARating(int input) {
        int ratings = lastRatings + 1;
        rating = ((rating * lastRatings) + input) / ratings;
        lastRatings = ratings;
        if (input == 5) {
            i++;
        }
        percentage = 100 / lastRatings * i;
    }


}

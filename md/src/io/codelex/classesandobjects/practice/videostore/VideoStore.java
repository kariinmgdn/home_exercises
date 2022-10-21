package io.codelex.classesandobjects.practice.videostore;

import java.util.ArrayList;
import java.util.List;

public class VideoStore {
    public List<Video> allVideos = new ArrayList<>();

    public void addVideo(String title) {
        Video newVideo = new Video(title);
        allVideos.add(newVideo);
    }

    public void checkOut(String title) {
        if (allVideos.get(search(title)).isCheckedOut()) {
            System.out.println("Movie is already rented!");
        } else {
            allVideos.get(search(title)).checkedOut();
        }
    }

    public void returnVideo(String title) {
        allVideos.get(search(title)).returned();
    }

    public void usersRating(String title, int rating) {
        allVideos.get(search(title)).receiveARating(rating);

    }

    public void inventory() {
        System.out.println("All movies: ");
        for (Video allVideo : allVideos) {
            if (allVideo.isCheckedOut()) {
                System.out.println("Name: " + allVideo.getName() + "(rating: " + allVideo.getRating() + "/5) - currently unavailable");
            } else {
                System.out.println("Name: " + allVideo.getName() + "(rating: " + allVideo.getRating() + "/5), " + allVideo.getPercentage() + "% of users liked this movie!");

            }
        }
    }

    private int search(String name) {
        for (Video movie : allVideos) {
            if (movie.getName().equals(name)) {
                return allVideos.indexOf(movie);
            }
        }
        return -1;
    }
}

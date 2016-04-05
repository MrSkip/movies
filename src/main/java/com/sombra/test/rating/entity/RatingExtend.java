package com.sombra.test.rating.entity;

/**
 * by Mr Skip on 05.04.2016.
 */

public class RatingExtend {

    private String movieTitle;
    private String userName;
    private int rating;

    public RatingExtend() {
    }

    public RatingExtend(String movieTitle, String userName, int rating) {
        this.movieTitle = movieTitle;
        this.userName = userName;
        this.rating = rating;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}

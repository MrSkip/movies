package com.sombra.test.rating.entity;

import java.sql.Date;

/**
 * by Mr Skip on 05.04.2016.
 */

public class RatingLess {

    private Long movieId;
    private Date ratingDate;

    public RatingLess() {
    }

    public RatingLess(Long movieId, Date ratingDate) {
        this.movieId = movieId;
        this.ratingDate = ratingDate;
    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public Date getRatingDate() {
        return ratingDate;
    }

    public void setRatingDate(Date ratingDate) {
        this.ratingDate = ratingDate;
    }
}

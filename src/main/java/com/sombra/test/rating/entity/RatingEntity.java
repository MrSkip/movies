package com.sombra.test.rating.entity;

import com.sombra.test.jpa.entity.BaseEntity;
import com.sombra.test.movie.entity.MovieEntity;
import com.sombra.test.user.entity.UserEntity;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.sql.Date;

/**
 * by Mr Skip on 04.04.2016.
 */

@Entity
@Table(name = "rating")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class RatingEntity extends BaseEntity{
    @Id
    @GeneratedValue
    private Long id;
    private Integer rating;
    private Date ratingDate;

    @ManyToOne
    @JoinColumn(name = "userId")
    private UserEntity user;

    @ManyToOne
    @JoinColumn(name = "movieId")
    private MovieEntity movie;

    public RatingEntity() {
    }

    public RatingEntity(
            Integer rating,
            Date ratingDate,
            UserEntity user,
            MovieEntity movie
    ) {
        this.rating = rating;
        this.ratingDate = ratingDate;
        this.user = user;
        this.movie = movie;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Date getRatingDate() {
        return ratingDate;
    }

    public void setRatingDate(Date ratingDate) {
        this.ratingDate = ratingDate;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public MovieEntity getMovie() {
        return movie;
    }

    public void setMovie(MovieEntity movie) {
        this.movie = movie;
    }

    @Override
    public String toString() {
        return "RatingEntity{" +
                "id=" + id +
                ", rating=" + rating +
                ", ratingDate=" + ratingDate +
                ", user=" + user.getName() +
                ", movie=" + movie.getTitle() +
                '}';
    }
}

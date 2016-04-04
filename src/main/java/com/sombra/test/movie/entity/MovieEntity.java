package com.sombra.test.movie.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sombra.test.jpa.entity.BaseEntity;
import com.sombra.test.rating.entity.RatingEntity;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.util.Set;

/**
 * by Mr Skip on 04.04.2016.
 */

@Entity
@Table(name = "movie")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class MovieEntity extends BaseEntity{
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String director;

    @OneToMany(mappedBy = "movie")
    @JsonIgnore
    private Set<RatingEntity> ratingSet;

    public MovieEntity() {
    }

    public MovieEntity(
            String title,
            String director
    ) {
        this.title = title;
        this.director = director;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Set<RatingEntity> getRatingSet() {
        return ratingSet;
    }

    public void setRatingSet(Set<RatingEntity> ratingSet) {
        this.ratingSet = ratingSet;
    }

    @Override
    public String toString() {
        return "MovieEntity{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", director='" + director + '\'' +
                '}';
    }
}

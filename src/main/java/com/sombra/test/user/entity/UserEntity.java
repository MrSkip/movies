package com.sombra.test.user.entity;

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
@Table(name = "user")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class UserEntity extends BaseEntity{
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private Set<RatingEntity> ratingSet;

    public UserEntity() {
    }

    public UserEntity(String name) {
        this.name = name;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<RatingEntity> getRatingSet() {
        return ratingSet;
    }

    public void setRatingSet(Set<RatingEntity> ratingSet) {
        this.ratingSet = ratingSet;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

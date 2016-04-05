package com.sombra.test.movie.repository;

import com.sombra.test.jpa.repository.JpaNew;
import com.sombra.test.movie.entity.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * by Mr Skip on 04.04.2016.
 */

@Repository
public interface MovieRepo extends JpaRepository<MovieEntity, Long> {

    @Query(value = "SELECT m.title FROM movie m " +
            "where m.id not in(select distinct r.movie_id from rating r)", nativeQuery = true)
    List<String> getTitleThatHaveNoRating();

    @Query(value = "SELECT m.title FROM movie m " +
            "where m.id in(select distinct r.movie_id from rating r)", nativeQuery = true)
    List<String> getTitleThatHaveRating();
}

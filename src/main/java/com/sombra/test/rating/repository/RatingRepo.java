package com.sombra.test.rating.repository;

import com.sombra.test.jpa.repository.JpaNew;
import com.sombra.test.rating.entity.RatingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * by Mr Skip on 04.04.2016.
 */

@Repository
public interface RatingRepo extends JpaRepository<RatingEntity, Long> {

    List<RatingEntity> findByRatingDateNull();
    List<RatingEntity> findByRatingInOrderByRatingDateAsc(int[] rating);

}

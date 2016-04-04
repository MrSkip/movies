package com.sombra.test.rating.service;

import com.sombra.test.jpa.dao.AccessDAO;
import com.sombra.test.jpa.repository.JpaNew;
import com.sombra.test.rating.entity.RatingEntity;
import com.sombra.test.rating.repository.RatingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * by Mr Skip on 04.04.2016.
 */

@Service
public class RatingService extends AccessDAO<RatingEntity>{

    private RatingRepo ratingRepo;

    @Autowired
    public RatingService(RatingRepo ratingRepo) {
        super(ratingRepo);
        this.ratingRepo = ratingRepo;
    }
}

package com.sombra.test.rating.controller;

import com.sombra.test.jpa.dao.AccessDAO;
import com.sombra.test.rating.entity.RatingEntity;
import com.sombra.test.rating.service.RatingService;
import com.sombra.test.rest.RestBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * by Mr Skip on 04.04.2016.
 */

@RestController
@RequestMapping("rating")
public class RatingController extends RestBase<RatingEntity>{

    private RatingService ratingService;

    @Autowired
    public RatingController(RatingService ratingService) {
        super(ratingService);
        this.ratingService = ratingService;
    }
}

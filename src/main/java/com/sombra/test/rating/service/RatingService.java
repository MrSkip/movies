package com.sombra.test.rating.service;

import com.sombra.test.exception.ExceptionMySQL;
import com.sombra.test.jpa.dao.AccessDAO;
import com.sombra.test.rating.entity.RatingEntity;
import com.sombra.test.rating.entity.RatingExtend;
import com.sombra.test.rating.entity.RatingLess;
import com.sombra.test.rating.repository.RatingRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

/**
 * by Mr Skip on 04.04.2016.
 */

@Service
public class RatingService extends AccessDAO<RatingEntity>{
    private final Logger log = LoggerFactory.getLogger(getClass());

    private RatingRepo ratingRepo;

    @Autowired
    public RatingService(RatingRepo ratingRepo) {
        super(ratingRepo);
        this.ratingRepo = ratingRepo;
    }

    public List<RatingEntity> setTodayDateInEmptyCell() throws ExceptionMySQL{
        log.info("Set the today date where `rating date` is null");
        for (RatingEntity entity : ratingRepo.findByRatingDateNull()) {
            entity.setRatingDate(new Date(Calendar.getInstance().getTime().getTime()));
            ratingRepo.save(entity);
        }
        return ratingRepo.findAll();
    }

    public List<RatingExtend> getExtendInfo(){
        log.info("Get extend information about rating");
        return ratingRepo
                .findAll()
                .stream()
                .map(ratingEntity -> new RatingExtend(
                        ratingEntity.getMovie().getTitle(),
                        ratingEntity.getUser().getName(),
                        ratingEntity.getRating()))
                .collect(Collectors.toList());
    }

    public List<RatingLess> getLessInfo(){
        log.info("Get less information about rating");
        return ratingRepo
                .findByRatingInOrderByRatingDateAsc(new int[]{4, 5})
                .stream()
                .map(entity -> new RatingLess(entity.getMovie().getId(), entity.getRatingDate()))
                .collect(Collectors.toList());
    }

}

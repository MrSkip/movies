package com.sombra.test.rating.controller;

import com.sombra.test.exception.ExceptionMySQL;
import com.sombra.test.jpa.dao.AccessDAO;
import com.sombra.test.rating.entity.RatingEntity;
import com.sombra.test.rating.entity.RatingExtend;
import com.sombra.test.rating.entity.RatingLess;
import com.sombra.test.rating.service.RatingService;
import com.sombra.test.rest.RestBase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * by Mr Skip on 04.04.2016.
 */

@RestController
@RequestMapping("rating")
public class RatingController extends RestBase<RatingEntity>{
    private final Logger log = LoggerFactory.getLogger(getClass());

    private RatingService ratingService;

    @Autowired
    public RatingController(RatingService ratingService) {
        super(ratingService);
        this.ratingService = ratingService;
    }

    @RequestMapping(value = "/date", method = RequestMethod.GET)
    public ResponseEntity<List<RatingEntity>> setTodayDateInEmptyCell(){
        try{
            return ResponseEntity.ok(ratingService.setTodayDateInEmptyCell());
        } catch (ExceptionMySQL e){
            log.info("Cant set the today date in empty cell, error: {}", e.getMessage());
            return ResponseEntity
                    .status(HttpStatus.CONFLICT)
                    .header("MySQL Exception", e.getMessage())
                    .body(null);
        }
    }

    @RequestMapping(value = "/extend", method = RequestMethod.GET)
    public ResponseEntity<List<RatingExtend>> getExtendInformation(){
        return ResponseEntity.ok(ratingService.getExtendInfo());
    }

    @RequestMapping(value = "/less", method = RequestMethod.GET)
    public ResponseEntity<List<RatingLess>> getLessInfo(){
        return ResponseEntity.ok(ratingService.getLessInfo());
    }
}

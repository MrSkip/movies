package com.sombra.test.movie.service;

import com.sombra.test.jpa.dao.AccessDAO;
import com.sombra.test.movie.entity.MovieEntity;
import com.sombra.test.movie.repository.MovieRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * by Mr Skip on 04.04.2016.
 */

@Service
public class MovieService extends AccessDAO<MovieEntity>{
    private final Logger log = LoggerFactory.getLogger(getClass());

    private MovieRepo movieRepo;

    @Autowired
    public MovieService(MovieRepo movieRepo){
        super(movieRepo);
        this.movieRepo = movieRepo;
    }

    public List<String> getTitleThatHaveNoRating(boolean rating){
        log.info("Get titles of all movies where rating is {}", rating);
        if (!rating)
            return movieRepo.getTitleThatHaveNoRating();
        else
            return movieRepo.getTitleThatHaveRating();
    }

}

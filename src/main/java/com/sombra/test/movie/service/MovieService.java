package com.sombra.test.movie.service;

import com.sombra.test.jpa.dao.AccessDAO;
import com.sombra.test.movie.entity.MovieEntity;
import com.sombra.test.movie.repository.MovieRepo;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * by Mr Skip on 04.04.2016.
 */

@Service
public class MovieService extends AccessDAO<MovieEntity>{

    private MovieRepo movieRepo;

    @Autowired
    public MovieService(MovieRepo movieRepo){
        super(movieRepo);
        this.movieRepo = movieRepo;
    }

}

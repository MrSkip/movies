package com.sombra.test.movie.controller;

import com.sombra.test.rest.RestBase;
import com.sombra.test.movie.entity.MovieEntity;
import com.sombra.test.movie.service.MovieService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * by Mr Skip on 04.04.2016.
 */

@RestController
@RequestMapping("movie")
public class MovieController extends RestBase<MovieEntity>{

    private MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) {
        super(movieService);
        this.movieService = movieService;
    }
}

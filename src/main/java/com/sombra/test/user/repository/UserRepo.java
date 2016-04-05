package com.sombra.test.user.repository;

import com.sombra.test.jpa.repository.JpaNew;
import com.sombra.test.movie.entity.MovieEntity;
import com.sombra.test.user.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * by Mr Skip on 04.04.2016.
 */

@Repository
public interface UserRepo extends JpaRepository<UserEntity, Long> {


}

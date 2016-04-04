package com.sombra.test.user.repository;

import com.sombra.test.jpa.repository.JpaNew;
import com.sombra.test.movie.entity.MovieEntity;
import com.sombra.test.user.entity.UserEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * by Mr Skip on 04.04.2016.
 */

@Repository
public interface UserRepo extends JpaNew<UserEntity, Long>{

    @Override
    @Query(value = "select * from movie limit :page, :count", nativeQuery = true)
    List<UserEntity> findAll(@Param("page") int page,
                              @Param("count") int count);

}

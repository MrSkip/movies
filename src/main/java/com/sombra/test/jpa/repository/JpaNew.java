package com.sombra.test.jpa.repository;

import com.sombra.test.jpa.entity.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.data.repository.NoRepositoryBean;

import javax.persistence.QueryHint;
import java.io.Serializable;
import java.util.List;

/**
 * by Mr Skip on 04.04.2016.
 */

@NoRepositoryBean
public interface JpaNew<S extends BaseEntity, ID extends Serializable> extends JpaRepository<S,ID>{

    /*
     * Pagination
    */

    @QueryHints(value = {@QueryHint(name = "org.hibernate.cacheable", value = "true")})
    List<S> findAll(int page, int count);

}

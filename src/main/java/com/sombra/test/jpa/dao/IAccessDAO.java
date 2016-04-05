package com.sombra.test.jpa.dao;

import java.util.List;

/**
 * by Mr Skip on 04.04.2016.
 */

public interface IAccessDAO<S> {

    S update(S s);
    void delete(Long id);
    S getOne(Long id);
    List<S> getAll();
    S save(S s);

}

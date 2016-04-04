package com.sombra.test.jpa.entity;

import java.io.Serializable;

/**
 * by Mr Skip on 04.04.2016.
 */

public class BaseEntity implements Serializable{

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
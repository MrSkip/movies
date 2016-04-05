package com.sombra.test.user.service;

import com.sombra.test.jpa.dao.AccessDAO;
import com.sombra.test.jpa.repository.JpaNew;
import com.sombra.test.user.entity.UserEntity;
import com.sombra.test.user.repository.UserRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * by Mr Skip on 04.04.2016.
 */

@Service
public class UserService extends AccessDAO<UserEntity>{
    private final Logger log = LoggerFactory.getLogger(getClass());

    private UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo) {
        super(userRepo);
        this.userRepo = userRepo;
    }
}

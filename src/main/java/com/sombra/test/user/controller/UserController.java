package com.sombra.test.user.controller;

import com.sombra.test.jpa.dao.AccessDAO;
import com.sombra.test.rest.RestBase;
import com.sombra.test.user.entity.UserEntity;
import com.sombra.test.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * by Mr Skip on 04.04.2016.
 */

@RestController
@RequestMapping("user")
public class UserController extends RestBase<UserEntity>{

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        super(userService);
        this.userService = userService;
    }
}

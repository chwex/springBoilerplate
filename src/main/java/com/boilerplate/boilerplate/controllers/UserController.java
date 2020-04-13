package com.boilerplate.boilerplate.controllers;

import com.boilerplate.boilerplate.application.UserApplication;
import com.boilerplate.boilerplate.domain.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @Autowired
    UserApplication userApplication;

    @GetMapping
    public List<User> getUsers() throws Exception{
        return this.userApplication.getUsers();
    }
}

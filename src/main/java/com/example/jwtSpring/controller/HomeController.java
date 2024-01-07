package com.example.jwtSpring.controller;

import com.example.jwtSpring.entity.User;
import com.example.jwtSpring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private UserService userService;

    //http://localhost:8080/home/user
    @GetMapping("/user")
    public List<User> getUser(){
        System.out.println("getting user");
        return userService.getUser();
    }
}

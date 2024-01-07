package com.example.jwtSpring.service;

import com.example.jwtSpring.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    private List<User> store = new ArrayList<>();

    public UserService(){
        store.add(new User(UUID.randomUUID().toString(), "Rima", "rimawahid3@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Rima1", "rima1@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Rima2", "rima2@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Rima3", "rima3@gmail.com"));
    }

    public List<User> getUser(){
        return this.store;
    }
}

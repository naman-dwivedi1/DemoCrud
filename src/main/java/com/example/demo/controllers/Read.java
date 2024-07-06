package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import  com.example.demo.model.User;
import com.example.demo.model.UserRepository;

@RestController
public class Read {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/api/read")
    public @ResponseBody Iterable<User> read()
    {
        return userRepository.findAll();
    }
}
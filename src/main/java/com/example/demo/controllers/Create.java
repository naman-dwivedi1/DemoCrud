package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.model.UserRepository;

@RestController
public class Create {
    @Autowired
	private UserRepository userRepository;

    @PostMapping("/api/create")
	public @ResponseBody String create(@RequestParam String name)
	{
		User newUser = new User(name);
		userRepository.save(newUser);
		return "saved";
	}

}

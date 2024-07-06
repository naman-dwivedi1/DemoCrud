package com.example.demo.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.model.UserRepository;

@RestController
public class Update {
    @Autowired
    private UserRepository userRepository;

    @PutMapping("/api/update")
    public @ResponseBody String update(@RequestParam Long id,@RequestParam String name)
    {
        User user=userRepository.findById(id).get();
        user.setUser(name);
        userRepository.save(user);
        return "updated";
    }
}

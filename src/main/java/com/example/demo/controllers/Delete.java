package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.model.UserRepository;

@RestController
public class Delete {
    @Autowired
    private UserRepository userRepository;

    @DeleteMapping("/api/delete")
    public ResponseEntity<?> delete(@RequestParam Long id)
    {
        User user=userRepository.findById(id).get();
        userRepository.delete(user);
        return ResponseEntity.ok(user);
    }
}

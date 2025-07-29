package com.springboot.maven.publis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.maven.publis.entity.UserEntity;
import com.springboot.maven.publis.service.UserService;
@RestController
@RequestMapping("/users") // Base URL for all endpoints
public class PublisController {

    @Autowired
    private UserService userService;

    // CREATE
    @PostMapping
    public UserEntity createUser(@RequestBody UserEntity user) {
        return userService.createUser(user);
    }

    // READ (Get user by ID)
    @GetMapping("/{id}")
    public UserEntity getUserById(@PathVariable Integer id) {
        return userService.getUserById(id);
    }

    // READ (Get all users)
    @GetMapping
    public List<UserEntity> getAllUsers() {
        return userService.getAllUsers();
    }

    // UPDATE
    @PutMapping("/{id}")
    public UserEntity updateUser(@PathVariable Integer id, @RequestBody UserEntity user) {
        return userService.updateUser(id, user);
    }

    // DELETE (by ID)
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Integer id) {
        boolean deleted = userService.deleteUser(id);
        return deleted ? "User deleted successfully" : "User not found";
    }

    // DELETE (all users)
    @DeleteMapping
    public String deleteAllUsers() {
        userService.deleteAllUsers();
        return "All users deleted successfully";
    }
}
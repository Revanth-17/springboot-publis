package com.springboot.maven.publis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.maven.publis.entity.UserEntity;
import com.springboot.maven.publis.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    // CREATE
    public UserEntity createUser(UserEntity user) {
        return userRepository.save(user);
    }

    // READ by ID
    public UserEntity getUserById(Integer id) {
        return userRepository.findById(id).orElse(null);
    }

    // READ all
    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }

    // UPDATE
    public UserEntity updateUser(Integer id, UserEntity updatedUser) {
        UserEntity existingUser = userRepository.findById(id).orElse(null);
        if (existingUser != null) {
            existingUser.setName(updatedUser.getName());
//            existingUser.setEmail(updatedUser.getEmail());
            // Add more fields as needed
            return userRepository.save(existingUser);
        }
        return null;
    }

    // DELETE by ID
    public boolean deleteUser(Integer id) {
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
            return true;
        }
        return false;
    }

    // DELETE all
    public void deleteAllUsers() {
        userRepository.deleteAll();
    }
}


package com.springboot.maven.publis.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.maven.publis.entity.UserEntity;
@Service
public interface UserService {

    UserEntity createUser(UserEntity user);

    UserEntity getUserById(Integer id);

    List<UserEntity> getAllUsers();

    UserEntity updateUser(Integer id, UserEntity updatedUser);

    boolean deleteUser(Integer id);

    void deleteAllUsers();
}
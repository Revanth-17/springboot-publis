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

    @Override
    public List<UserEntity> fetchUsers()
    {
    	
    	return null; 
    }
}


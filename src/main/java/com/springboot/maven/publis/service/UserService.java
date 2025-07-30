package com.springboot.maven.publis.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.maven.publis.entity.UserEntity;
@Service
public interface UserService 
{
	public List<UserEntity> fetchUsers(); 
}
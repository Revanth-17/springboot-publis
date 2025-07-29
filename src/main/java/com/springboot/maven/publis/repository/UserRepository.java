package com.springboot.maven.publis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.maven.publis.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer>
{
	
}

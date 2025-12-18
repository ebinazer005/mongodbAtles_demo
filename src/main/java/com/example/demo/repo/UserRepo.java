package com.example.demo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.entity.UserEntity;

public interface UserRepo extends MongoRepository<UserEntity,String> {

}

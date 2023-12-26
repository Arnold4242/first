package com.example.demo.project;

import org.apache.catalina.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FirstRepository extends MongoRepository<User, String> {

}

package com.serey.homescreen.homescreen.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.serey.homescreen.homescreen.pojo.SereyPosts;

public interface PostsRepo extends MongoRepository<SereyPosts, String> {

}

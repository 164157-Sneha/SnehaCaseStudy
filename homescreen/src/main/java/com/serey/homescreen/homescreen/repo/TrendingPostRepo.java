package com.serey.homescreen.homescreen.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.serey.homescreen.homescreen.pojo.SereyTrendingPosts;

public interface TrendingPostRepo extends MongoRepository<SereyTrendingPosts, String> {

}

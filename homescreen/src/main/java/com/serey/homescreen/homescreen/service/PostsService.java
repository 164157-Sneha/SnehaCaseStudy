package com.serey.homescreen.homescreen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.serey.homescreen.homescreen.pojo.SereyPosts;
import com.serey.homescreen.homescreen.repo.PostsRepo;


@Component
public class PostsService {
	@Autowired
	PostsRepo postRepo;
	public boolean savePost(SereyPosts sereyPosts) {
		// TODO Auto-generated method stub
		postRepo.save(sereyPosts);
		return true;
		
	}
}

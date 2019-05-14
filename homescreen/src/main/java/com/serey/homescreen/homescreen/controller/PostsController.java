package com.serey.homescreen.homescreen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.serey.homescreen.homescreen.pojo.SereyPosts;
import com.serey.homescreen.homescreen.service.PostsService;



//@CrossOrigin(origins="http://localhost:4200")
@RestController
public class PostsController {
	@Autowired
	PostsService  PostService; 
	@PostMapping("/add")
	boolean savePost(@RequestBody SereyPosts sereyPosts ) {
		
		PostService.savePost(sereyPosts);
		return true;
	}
}

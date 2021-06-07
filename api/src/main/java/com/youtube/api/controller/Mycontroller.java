package com.youtube.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.youtube.api.dao.UsersDao;
import com.youtube.api.entity.User;
import com.youtube.api.services.YoutubeService;

@RestController
public class Mycontroller {
	
	@Autowired
	private YoutubeService youtubeService;
	@Autowired
	private UsersDao usersdao;
	
	@GetMapping("/users")
	public List<User> getUsers()
	{
		return this.youtubeService.getUsers();
	}
	
	@GetMapping("/users/{name}")
	public Iterable<User> getUserByName(@PathVariable String name)
	{
		return this.usersdao.getUserByName(name);
	}
	
	@PostMapping("/users")
	public User createUser(@RequestBody User user)
	{
		return this.youtubeService.createUser(user);
	}
	
	//Update course
	
	@PutMapping("/users")
	public User updateUser(@RequestBody User user)
	{
		return this.youtubeService.updateUser(user);
	}
	
	//Delete by Name
	@DeleteMapping("/users/{id}")
	public ResponseEntity<HttpStatus> deleteUserById(@PathVariable long id)
	{
		try {
			this.youtubeService.deleteUserById(id);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}

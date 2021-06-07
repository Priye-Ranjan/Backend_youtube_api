package com.youtube.api.services;

import java.util.List;

import com.youtube.api.entity.User;


public interface YoutubeService {
	
	public List<User> getUsers();
	
	//public User getUserByName(String name);
	
	public void deleteUserById(long id);
	
	public User updateUser(User user);
	
	public User createUser(User user);

	//User getUserByName(String name);
}

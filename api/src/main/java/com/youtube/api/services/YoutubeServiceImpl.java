package com.youtube.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youtube.api.dao.UsersDao;
import com.youtube.api.entity.User;

@Service
public class YoutubeServiceImpl implements YoutubeService {

	@Autowired
	public UsersDao usersDao;
	
	
	 public YoutubeServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<User> getUsers() {
		return usersDao.findAll();
	}
	
	public Iterable<User> getUserByName(String name) {
		return usersDao.getUserByName(name);
	}

	@Override
	public void deleteUserById(long id) {
		User entity=usersDao.getOne(id);
		usersDao.delete(entity);
	}
	
	@Override
	public User updateUser(User user) {
		usersDao.save(user);
		return user;
		
	}

	@Override
	public User createUser(User user) {
		usersDao.save(user);

		return user;
		
	}

	
	
	
}

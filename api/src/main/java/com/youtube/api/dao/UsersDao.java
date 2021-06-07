package com.youtube.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.youtube.api.entity.User;

@Repository
public interface UsersDao extends JpaRepository<User, Long> {

	public Iterable<User> getUserByName(String name);
	
	//public void deleteUserByName(User user);

	//public User getOne(String name);

}

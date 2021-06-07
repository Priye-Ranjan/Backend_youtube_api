package com.youtube.api.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String email;
	private String password;
	private int age;
	private String channelName;
	private int totalVideos;
	private int subscribers;
	private int totalViews;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(long id, String name, String email, String password, int age, String channelName, int totalVideos,
			int subscribers, int totalViews) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.age = age;
		this.channelName = channelName;
		this.totalVideos = totalVideos;
		this.subscribers = subscribers;
		this.totalViews = totalViews;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public int getTotalVideos() {
		return totalVideos;
	}

	public void setTotalVideos(int totalVideos) {
		this.totalVideos = totalVideos;
	}

	public int getSubscribers() {
		return subscribers;
	}

	public void setSubscribers(int subscribers) {
		this.subscribers = subscribers;
	}

	public int getTotalViews() {
		return totalViews;
	}

	public void setTotalViews(int totalViews) {
		this.totalViews = totalViews;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", age=" + age
				+ ", channelName=" + channelName + ", totalVideos=" + totalVideos + ", subscribers=" + subscribers
				+ ", totalViews=" + totalViews + "]";
	}
	
	
	
}

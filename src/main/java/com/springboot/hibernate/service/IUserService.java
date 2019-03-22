package com.springboot.hibernate.service;

import java.util.List;

import com.springboot.hibernate.entity.User;

public interface IUserService {
	
	public List<User> getAllUsers();
    
    public User getUser(String id);
    
    public void addUser(User userRecord);
    
    public void delete(String id);
}

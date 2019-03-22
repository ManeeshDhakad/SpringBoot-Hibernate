package com.springboot.hibernate.dao;

import java.util.List;

import com.springboot.hibernate.entity.User;

public interface IUserDao {
	public List<User> getAllUsers();
    
    public User getUser(String id);
    
    public void addUser(User userRecord);
    
    public void delete(String id);

}

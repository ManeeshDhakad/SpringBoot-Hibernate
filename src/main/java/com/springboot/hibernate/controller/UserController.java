package com.springboot.hibernate.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.RequestBody;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;  
import org.springframework.web.bind.annotation.RestController;

import com.springboot.hibernate.entity.User;
import com.springboot.hibernate.service.UserService;

import java.util.List; 

@RestController  
public class UserController {  
	
	private Logger logger = LoggerFactory.getLogger(UserController.class);
	
    @Autowired  
    private UserService userService;
    
    @RequestMapping("/")  
    public List<User> getAllUser(){  
    	logger.info("Getting user information : " + "getAllUser()");
        return userService.getAllUsers();  
    }     
    
    @RequestMapping(value="/add-user", method=RequestMethod.POST)  
    public void addUser(@RequestBody User userRecord){  
    	logger.info("Adding new user information : " + "addUser()");
        userService.addUser(userRecord);  
    }  
    
    @RequestMapping(value="/get-user/{id}", method=RequestMethod.GET)  
    public User getUser(@PathVariable String id){  
        return userService.getUser(id);  
    }  
    
    @RequestMapping(value="/delete-user/{id}", method=RequestMethod.GET)  
    public void deleteUser(@PathVariable String id){  
        userService.delete(id);  
    }
}  
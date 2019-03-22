package com.springboot.jpa;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.springboot.hibernate.HibernateApplication;
import com.springboot.hibernate.entity.User;
import com.springboot.hibernate.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=HibernateApplication.class)
public class UserControllerTest {

	@Autowired
	private UserService userService;
	
	@Test
	public void testGetUser() {	
		
		User user = userService.getUser("101");
		assertEquals("Maneesh", user.getName());
		assertEquals("maneesh@gmail.com", user.getEmail());
	}
}

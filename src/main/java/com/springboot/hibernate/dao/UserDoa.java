package com.springboot.hibernate.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.hibernate.entity.User;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Transactional
@Repository
public class UserDoa implements IUserDao {
	
	@PersistenceContext	
	private EntityManager entityManager;	

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getAllUsers() {
		String hql = "FROM User as u ORDER BY u.id";
		return (List<User>) entityManager.createQuery(hql).getResultList();
	}

	@Override
	public User getUser(String id) {
		return entityManager.find(User.class, id);
	}

	@Override
	public void addUser(User user) {
		entityManager.persist(user);
	}

	@Override
	public void delete(String id) {
		entityManager.remove(getUser(id));

	}

}

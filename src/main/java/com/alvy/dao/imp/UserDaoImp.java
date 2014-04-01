package com.alvy.dao.imp;

import java.io.Serializable;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.alvy.dao.UserDao;
import com.alvy.entity.User;

@Repository("userDao")
public class UserDaoImp implements UserDao {
	@Autowired
	private SessionFactory sessionFactory;

	public Serializable save(User user) {
		return sessionFactory.getCurrentSession().save(user);
	}

}
package com.alvy.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alvy.dao.UserDao;
import com.alvy.entity.User;
import com.alvy.service.UserService;

@Service("userService")
@Transactional
public class UserServiceImp implements UserService {
	@Autowired
	private UserDao userDao;

	public void addUser(User user) {
		userDao.save(user);
	}

}
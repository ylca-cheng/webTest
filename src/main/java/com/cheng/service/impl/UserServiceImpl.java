package com.cheng.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cheng.dao.UserDao;
import com.cheng.domain.User;
import com.cheng.service.intf.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public List<User> findAll() {
		return userDao.findAll();
	}

	@Override
	public void insertUsers(List<User> users) {
		for(User user : users) {
			userDao.insertUser(user);
		}
		
	}

	@Override
	public void insertUser(User user) {
		userDao.insertUser(user);
	}

}

package com.cheng.dao;

import java.util.List;

import com.cheng.domain.User;

public interface UserDao {

	// 查询所有用户
	public List<User> findAll();
	
	// 新增一个用户
	public void insertUser(User user);
}

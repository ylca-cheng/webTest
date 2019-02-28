package com.cheng.service.intf;

import java.util.List;

import com.cheng.domain.User;

public interface UserService {

	public List<User> findAll();
	
	public void insertUsers(List<User> users);
	
	public void insertUser(User user);
}

package com.healthy.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthy.mapper.userMapper;

@Service
public class UserDTO implements UserService{

	@Autowired
	userMapper userMapper;

	@Override
	public void userJoin(UserDAO user) throws Exception {
		userMapper.userJoin(user);
		
	}

	
}

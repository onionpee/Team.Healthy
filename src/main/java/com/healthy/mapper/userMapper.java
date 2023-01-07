package com.healthy.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.healthy.user.UserDAO;

@Mapper
public interface userMapper {

	public void userJoin(UserDAO user);
	
	public UserDAO userCheck(UserDAO user);
}

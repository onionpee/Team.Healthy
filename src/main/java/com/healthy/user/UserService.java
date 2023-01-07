package com.healthy.user;

public interface UserService {

	public void userJoin(UserDAO user) throws Exception;
	
	public UserDAO userCheck(UserDAO user) throws Exception;
}

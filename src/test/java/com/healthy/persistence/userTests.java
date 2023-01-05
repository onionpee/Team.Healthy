package com.healthy.persistence;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.healthy.mapper.userMapper;
import com.healthy.user.UserDAO;

import lombok.extern.log4j.Log4j;

@Log4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class userTests {

	@Autowired 
	private userMapper userMapper;
	
	@Test
	public void userJoin() throws Exception {
		
		UserDAO user = new UserDAO();
		
		user.setUserId("111");
		user.setUserPW("111");
		user.setUserName("111");
		user.setUserEmail("111");
		
		userMapper.userJoin(user);
	}
}

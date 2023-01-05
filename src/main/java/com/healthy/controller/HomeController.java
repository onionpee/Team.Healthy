package com.healthy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.healthy.user.UserDAO;
import com.healthy.user.UserDTO;
import com.healthy.user.UserService;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("*")
public class HomeController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("test")
	public String test() {
		
		return "fuck";
	}
	
	@RequestMapping("main")
	public String home() {
		return "main/main";
	}
	
	@RequestMapping("diet")
	public String diet() {
		
		return "main/diet";
	}
	
	@RequestMapping("today")
	public String today() {
		
		return "main/today";
	}
	
	@RequestMapping("HandExercise")
	public String HandExercise() {
		
		return "exercise/HandExercise";
	}
	
	@RequestMapping("MachineExercise")
	public String MachineExercise() {
		
		return "exercise/MachineExercise";
	}
	
	@RequestMapping("myPage")
	public String myPage() {
		
		return "main/myPage";
	}
	
	@RequestMapping("login")
	public String login() {
		
		return "user/login";
	}
	
	@RequestMapping(value = "join", method = {RequestMethod.GET})
	public String join() {
		
		return "user/join";
	}
	
	@RequestMapping(value = "join", method = {RequestMethod.POST})
	public String joinPost(UserDAO user) throws Exception {

		userService.userJoin(user);
		
		return "redirect:/main";
	}

}

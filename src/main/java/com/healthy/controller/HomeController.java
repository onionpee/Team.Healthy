package com.healthy.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	
	@RequestMapping(value = "login", method = {RequestMethod.POST})
	public String loginPost(HttpServletRequest request, UserDAO user, RedirectAttributes attr) throws Exception {
		
		HttpSession session = request.getSession();
		UserDAO dao = userService.userCheck(user);
		
		if (dao == null) {
			
			int result = 0;
			attr.addFlashAttribute("result", result);
			
			return "redirect:/login";
		}
		
		session.setAttribute("user", dao);
		
		return "redirect:/main";
	}

}

package com.learnSpheree.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.learnSpheree.entities.Users;
import com.learnSpheree.services.UsersService;

import jakarta.servlet.http.HttpSession;

@Controller
public class UsersController
{
	@Autowired
	UsersService uservice;
	@PostMapping("/addUser")
	public String addUser(@ModelAttribute Users user)
	{
		String email=user.getEmail();
		boolean isPresent=uservice.checkEmail(email);
		if (isPresent==false)
		{
			uservice.addUser(user);
		}
		else {
			System.out.println("email already present");
		}
		return "login";
	}
	@PostMapping("/validateUser")
	public String validateUser(@RequestParam("email") String email,
			@RequestParam ("password") String password, HttpSession session)
	{
		System.out.println(email+" "+password);
		
		Users user= uservice.findUserByEmail(email);
		String dbPassword=user.getPassword();
		String role=user.getRole();
		if(password.equals(dbPassword))
		{
			
			session.setAttribute("loggedInUser", user);
			//m.addAttribute("user",user);
			
			if (role.equals("trainer"))
			{
				return "trainerHome";
			}
			else
			{
				return "studentHome";
			}
			}
			else
			{
				return "login";
			}
			
		}
		
	@GetMapping("/logout")
    public String logout(HttpSession session) {
        // Invalidate the session to perform logout
        session.invalidate();

        // Redirect to a login or home page after logout
        return "login"; // Redirect to the login page
    }
}
	
	



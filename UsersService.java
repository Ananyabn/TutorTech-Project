package com.learnSpheree.services;

import com.learnSpheree.entities.Users;

public interface UsersService
{
	
	String addUser(Users user);
	Users findUserByEmail(String email);
	boolean checkEmail(String email);
	String saveUsers(Users user);
	
	
	
	
	
	
}


	



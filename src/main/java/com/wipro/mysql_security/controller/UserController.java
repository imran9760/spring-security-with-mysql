package com.wipro.mysql_security.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.mysql_security.entity.Users;
import com.wipro.mysql_security.model.UserRequest;
import com.wipro.mysql_security.service.UserCreationService;

@RestController
public class UserController {

	@Autowired
	private UserCreationService service;

	@RequestMapping(value = "/admin/save-user", method = RequestMethod.POST)
	public void createUser(@RequestBody UserRequest userRequest) throws Exception {
		service.saveUser(userRequest);
	}

	@RequestMapping("/admin/update-user")
	public String updateUser() {
		return "Updated User";
	}

	@RequestMapping("/admin/delete-user")
	public String deleteUser() {
		return "Deleted User";
	}

	@RequestMapping("/user/users")
	public List<Users> getAllUsers() {
		return service.getAllUsers();
	}

	@RequestMapping("/user/message")
	public String getWelcomeMessageForUser() {
		return "Welcome to User";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@RequestBody UserRequest userRequest) {
		return service.verifyUser(userRequest);
	}
}

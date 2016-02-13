package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.dao.UserDAO;
import com.demo.entity.User;

@RestController
public class UserController {

	@Autowired
	UserDAO userDAO;

	@RequestMapping("/login")
	public String processUserLogin() {
		return "success";
	}

	@RequestMapping("/signup")
	public String processRegisterUser(@RequestBody User user) {

		userDAO.save(user);

		System.out.println("Added successful...");

		return "Success";
	}
}

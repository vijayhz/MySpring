package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.dao.PersonDAO;

@RestController
public class PersonController {

	@Autowired
	PersonDAO personDAO;

	@RequestMapping("/login")
	public String getPerson() {

		return "Success";
	}
}

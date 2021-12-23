package com.bezkoder.springjwt.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bezkoder.springjwt.models.User;
import com.bezkoder.springjwt.services.UserService;

@CrossOrigin(origins = "*")
@RestController
public class UserController {
	@Autowired
	private UserService userService;

	@GetMapping("/User/{id}")
	public List<User> getMembresProj(@PathVariable Integer id) {
		return userService.getUsersProj(id);
	}
}

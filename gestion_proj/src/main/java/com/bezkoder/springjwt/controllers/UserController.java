package com.bezkoder.springjwt.controllers;

import java.util.List;
import java.util.Optional;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bezkoder.springjwt.models.User;
import com.bezkoder.springjwt.services.UserService;

@CrossOrigin(origins = "*")
@RestController
public class UserController {
	@Autowired
	private UserService userService;

	@GetMapping("/user/{id}")
	public Optional<User> getUserById(@PathVariable Long id) {
		return userService.getUserById(id);
	}

	@GetMapping("/User/{id}")
	public List<User> getMembresProj(@PathVariable Integer id) {
		return userService.getUsersProj(id);
	}

	@GetMapping("/addMember/{idUser}/{idProjet}")
	public void addMembreToProject(@PathVariable Long idUser, @PathVariable Integer idProjet) {
		userService.addMembreToProject(idUser, idProjet);
	}

	@PostMapping("InviterMembre/{idUser}/{idProjet}")
	public void Invitation(@PathVariable Long idUser, @PathVariable Integer idProjet) throws MessagingException {
		userService.Invitation(idUser, idProjet);
	}

	@GetMapping("findIdByEmail/{email}")
	public Integer findIdByEmail(@PathVariable String email) {
		return userService.findIdByEmail(email);
	}
}

package com.bezkoder.springjwt.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bezkoder.springjwt.models.SprintBacklog;
import com.bezkoder.springjwt.services.SprintBacklogService;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class SprintBacklogController {
	@Autowired
	SprintBacklogService sprintBacklogService;

	@PostMapping("/ajouterSprint")
	public void ajouterSprint(@RequestBody SprintBacklog sprintBacklog) {
		sprintBacklogService.ajouterSprint(sprintBacklog);
	}

	@GetMapping("/getAllSprint/{idProjet}")
	public List<SprintBacklog> getAllSprint(@PathVariable Integer idProjet) {
		return sprintBacklogService.getAllSprint(idProjet);
	}

	@GetMapping("/getAllSprintByEtat/{idProjet}")
	public List<SprintBacklog> getAllSprintByEtat(@PathVariable Integer idProjet) {
		return sprintBacklogService.getAllSprintByEtat(idProjet);
	}

}

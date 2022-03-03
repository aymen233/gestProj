package com.bezkoder.springjwt.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.bezkoder.springjwt.models.SprintBacklog;
import com.bezkoder.springjwt.services.SprintBacklogService;
@CrossOrigin(origins = "*", maxAge = 3600)

@RestController
public class SprintBacklogController {
	@Autowired
	SprintBacklogService sprintBacklogService;

	@PostMapping("/ajouterSprint")
	public void ajouterSprint(@RequestBody SprintBacklog sprintBacklog) {
		sprintBacklogService.ajouterSprint(sprintBacklog);
	}

	@GetMapping("/getAllSprint/{idProjet}")
	public List<SprintBacklog> getAllSprint(@PathVariable Integer idProjet) {
		return sprintBacklogService.getsprintByProject(idProjet);
	}
	@PutMapping("/demmarreSprintBacklog/{idSprintBacklog}")
	public void demmareSprintBacklog(@PathVariable Integer idSprintBacklog) {
		sprintBacklogService.demmareSprintBacklog(idSprintBacklog);
	}

}

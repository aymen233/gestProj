package com.bezkoder.springjwt.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bezkoder.springjwt.models.Projet;
import com.bezkoder.springjwt.services.ProjetService;

@CrossOrigin(origins = "*")
@RestController
public class ProjetController {

	@Autowired
	private ProjetService projetService;

	@PostMapping("/projet")
	public void addproject(@RequestBody Projet projet) {
		projetService.addProjet(projet);
	}

	@GetMapping("/projets/{id}")
	public List<Projet> getAllProjetUser(@PathVariable Long id) {
		return (List<Projet>) projetService.getAllProjetUser(id);
	}

	@GetMapping("/Projet/{id}")
	public Optional<Projet> getProjets(@PathVariable Integer id) {
		return projetService.getProjet(id);
	}

	@PutMapping("/projet/{id}")
	public void updateProjet(@PathVariable Integer id, @RequestBody Projet projet) {
		projetService.updatePorojet(id, projet);
	}

	@DeleteMapping("/projet/{id}")
	public void deleteProjet(@PathVariable Integer id) {
		projetService.deleteProjet(id);
	}
}
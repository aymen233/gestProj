package com.bezkoder.springjwt.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bezkoder.springjwt.models.Raccourci;
import com.bezkoder.springjwt.services.RaccourciService;

@CrossOrigin(origins = "*")
@RestController
public class RaccourciController {
	@Autowired
	private RaccourciService raccourciService;

	@PostMapping("/addRaccourci")
	public void addproject(@RequestBody Raccourci raccourci) {
		raccourciService.addRaccourci(raccourci);
	}

	@GetMapping("/ListRaccourci/{idProjet}")
	public List<Raccourci> GetRaccourci(@PathVariable Integer idProjet) {
		return raccourciService.getRaccourciByIdProjet(idProjet);
	}

	@DeleteMapping("/Raccourci/{id}")
	public void deleteRaccourci(@PathVariable Integer id) {
		raccourciService.deleteRaccourci(id);
	}

	@PutMapping("/updateRaccourci/{id}")
	public void updateRaccourci(@PathVariable Integer id, @RequestBody Raccourci raccourci) {
		raccourciService.updateRaccourci(id, raccourci);
	}

}

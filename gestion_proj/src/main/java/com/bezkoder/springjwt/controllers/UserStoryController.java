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

import com.bezkoder.springjwt.models.EtatUserStory;
import com.bezkoder.springjwt.models.UserStory;
import com.bezkoder.springjwt.services.UserStoryService;

@CrossOrigin(origins = "*")
@RestController
public class UserStoryController {
	@Autowired
	private UserStoryService userStoryService;

	@PostMapping("/addUserStory")
	public void addUserStory(@RequestBody UserStory userStory) {
		userStoryService.addUserStory(userStory);
	}

	@GetMapping("/getUserStory/{id}")
	public Optional<UserStory> getUserStory(@PathVariable Integer id) {
		return userStoryService.getUserStory(id);
	}

	@GetMapping("/getAllUserStoryByProjetId/{id}")
	public List<UserStory> getAllUserStoryByProjetId(@PathVariable Integer id) {
		return userStoryService.getAllUserStoryByProjetId(id);
	}

	@GetMapping("/getAllUserStoryBySprintId/{sprintBacklogId}")
	public List<UserStory> getAllUserStoryBySprintId(@PathVariable Integer sprintBacklogId) {
		return userStoryService.getAllUserStoryBySprintId(sprintBacklogId);
	}

	@PutMapping("/updateUserStory/{id}")
	public void updateUserStory(@PathVariable Integer id, @RequestBody UserStory userStory) {
		userStoryService.updateUserStory(id, userStory);
	}

	@PutMapping("/updateEtatUserStory/{id}/{etat}")
	public void updateEtatUserStory(@PathVariable Integer id, @PathVariable EtatUserStory etat) {
		userStoryService.updateEtatUserStory(id, etat);
	}

	@PutMapping("/updateSprintIdUserStory/{id}/{sprintId}")
	public void updateSprintIdUserStory(@PathVariable Integer id, @PathVariable Integer SprintId) {
		userStoryService.updateSprintIdUserStory(id, SprintId);
	}

	@DeleteMapping("/deleteUserStory/{id}")
	public void deleteUserStory(@PathVariable Integer id) {
		userStoryService.deleteUserStory(id);
	}
}

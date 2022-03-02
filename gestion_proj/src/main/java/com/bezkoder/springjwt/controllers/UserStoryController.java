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

import com.bezkoder.springjwt.models.UserStory;
import com.bezkoder.springjwt.services.UserStoryService;

@CrossOrigin(origins = "*")
@RestController
public class UserStoryController {
	@Autowired
	private UserStoryService userStoryService;

	@PostMapping("/userStory")
	public void addUserStory(@RequestBody UserStory userStory) {
		userStoryService.addUserStory(userStory);
	}

	@GetMapping("/userStorys/{id}")
	public List<UserStory> getAllUserStoryProjet(@PathVariable Integer id) {
		return userStoryService.getAllUserStoryProjet(id);
	}

	@GetMapping("/userStorybySprintId/{sprintBacklogId}")
	public List<UserStory> getAllUserStoryBySprintId(@PathVariable Integer sprintBacklogId,@PathVariable Integer idProjet) {
		return userStoryService.getAllUserStoryBySprintId(sprintBacklogId);
	}

	@GetMapping("/userStory/{id}")
	public Optional<UserStory> getUserStory(@PathVariable Integer id) {
		return userStoryService.getUserStory(id);
	}

	@PutMapping("/userStory/{id}")
	public void updateUserStory(@PathVariable Integer id, @RequestBody UserStory userStory) {
		userStoryService.updateUserStory(id, userStory);
	}

	/*
	 * @PutMapping("/userStoryEtat/{id}") public void
	 * updateEtatUserStory(@PathVariable Integer id, @RequestBody UserStory
	 * userStory) { userStoryService.updateEtatUserStory(id, userStory); }
	 */

	@DeleteMapping("/userStory/{id}")
	public void deleteUserStory(@PathVariable Integer id) {
		userStoryService.deleteUserStory(id);
	}
}

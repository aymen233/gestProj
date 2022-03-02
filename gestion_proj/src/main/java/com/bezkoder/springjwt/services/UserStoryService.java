package com.bezkoder.springjwt.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bezkoder.springjwt.models.UserStory;
import com.bezkoder.springjwt.repository.UserStoryRepository;

@Service
public class UserStoryService {
	@Autowired
	private UserStoryRepository userStoryRepository;

	public void addUserStory(UserStory userStory) {
		userStoryRepository.save(userStory);
	}

	public List<UserStory> getAllUserStoryProjet(Integer id) {
		return (List<UserStory>) userStoryRepository.findByProjetId(id);
	}

	public Optional<UserStory> getUserStory(Integer id) {
		return userStoryRepository.findById(id);
	}

	public void updateUserStory(Integer id, UserStory userStory) {
		userStoryRepository.save(userStory);
	}

	public void deleteUserStory(Integer id) {
		userStoryRepository.deleteById(id);
	}

	/*public List<UserStory> getAllUserStoryBySprintId(Integer id) {

		return userStoryRepository.findBySprintBacklogId(id);
	}*/

	public void deleteUserStoryById(Integer sprintBacklogId,Integer idProjet) {
		userStoryRepository.deleteUserstory(sprintBacklogId,idProjet);
	}
	public List<UserStory> getAllUserStoryBySprintId(Integer sprintBacklogId,Integer idProjet) {

		return userStoryRepository.getUserstoriesByIdSprintBacklog(sprintBacklogId,idProjet);
	}

	/*
	 * public void updateEtatUserStory(Integer id, UserStory userStory) {
	 * userStoryRepository.updateEtatUserStory(id, userStory); }
	 */
}

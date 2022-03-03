package com.bezkoder.springjwt.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bezkoder.springjwt.models.EtatUserStory;
import com.bezkoder.springjwt.models.UserStory;
import com.bezkoder.springjwt.repository.UserStoryRepository;

@Service
public class UserStoryService {
	@Autowired
	private UserStoryRepository userStoryRepository;

	public void addUserStory(UserStory userStory) {
		userStoryRepository.save(userStory);
	}

	public Optional<UserStory> getUserStory(Integer id) {
		return userStoryRepository.findById(id);
	}

	public List<UserStory> getAllUserStoryByProjetId(Integer id) {
		return userStoryRepository.findByProjetId(id);
	}

	public List<UserStory> getAllUserStoryBySprintId(Integer id) {
		return userStoryRepository.findBySprintBacklogId(id);
	}

	public void updateUserStory(Integer id, UserStory userStory) {
		userStoryRepository.save(userStory);
	}


	public void updateEtatUserStory(Integer id, EtatUserStory etat) {
		userStoryRepository.updateEtatUserStory(id, etat);
	}

	public void updateSprintIdUserStory(Integer id, Integer sprintId) {
		userStoryRepository.updateSprintIdUserStory(sprintId, id);
	}

	public void resetUserStory(Integer id) {
		userStoryRepository.resetuserStory( id);
	}

	public void deleteUserStory(Integer id) {userStoryRepository.deleteById(id);}
	public void doingUs(Integer id) {userStoryRepository.doingUs(id);}
	public void todoUs(Integer id) {userStoryRepository.todoUs(id);}
	public void doneUs(Integer id) {userStoryRepository.doneUs(id);}

	public void deleteUserStoryById(Integer sprintBacklogId) {
		userStoryRepository.deleteUserstory(sprintBacklogId);
	}


	/*
	 * public void updateEtatUserStory(Integer id, UserStory userStory) {
	 * userStoryRepository.updateEtatUserStory(id, userStory); }
	 */
	public List<UserStory> getTodoUserStory(Integer id){return userStoryRepository.findTodoStory(id);}
	public List<UserStory> getDoingUserStory(Integer id){return userStoryRepository.finddoingStory(id);}
	public List<UserStory> getDoneUserStory(Integer id){return userStoryRepository.findDoneStory(id);}


}

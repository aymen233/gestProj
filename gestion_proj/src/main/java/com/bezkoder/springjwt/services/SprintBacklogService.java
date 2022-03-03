package com.bezkoder.springjwt.services;

import java.util.List;

import com.bezkoder.springjwt.models.UserStory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bezkoder.springjwt.models.SprintBacklog;
import com.bezkoder.springjwt.repository.SprintBacklogRepository;

@Service
public class SprintBacklogService {
	@Autowired
	SprintBacklogRepository sprintBacklogRepository;

	public void ajouterSprint(SprintBacklog sprintBacklog) {
		sprintBacklogRepository.save(sprintBacklog);
	}

	public List<SprintBacklog> getAllSprint(Integer idProjet) {
		return sprintBacklogRepository.getAllSprint(idProjet);
	}
	public List<SprintBacklog> getDemarreSprint(Integer idProjet) {
		return sprintBacklogRepository.getDemarreSprint(idProjet);
	}
	public List<SprintBacklog> getsprintByProject(Integer id) {
		return (List<SprintBacklog>) sprintBacklogRepository.getSprintBacklogByiDProject(id);
	}


	public void updateSprintBacklog(Integer id, SprintBacklog sprintBacklog) {
		sprintBacklogRepository.save(sprintBacklog);
	}

	public void deleteSprintBacklog(Integer id) {
		sprintBacklogRepository.deleteById(id);
	}
	public void demmareSprintBacklog(Integer idSprintBacklog) {
		sprintBacklogRepository.demmareSprintBacklog(idSprintBacklog);
	}


	public List<SprintBacklog> getAllSprintByEtat(Integer idProjet) {
		return sprintBacklogRepository.getAllSprintByEtat(idProjet);
	}

}

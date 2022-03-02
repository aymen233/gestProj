package com.bezkoder.springjwt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bezkoder.springjwt.models.SprintBacklog;

@Repository
public interface SprintBacklogRepository extends CrudRepository<SprintBacklog, Integer> {

	@Query(value = "select*  from sprint_backlog where proj_id=?1 and sprint_backlog.etat!='TERMINÉ'", nativeQuery = true)
	List<SprintBacklog> getAllSprint(Integer idProjet);

	@Query(value = "select*  from gestionprojet.sprint_backlog, gestionprojet.user_story where  user_story.sprint_backlog_id=sprint_backlog.id and user_story.projet_id=?1 and sprint_backlog.etat='DEMARRÉ'", nativeQuery = true)
	List<SprintBacklog> getAllSprintByEtat(Integer idProjet);

}

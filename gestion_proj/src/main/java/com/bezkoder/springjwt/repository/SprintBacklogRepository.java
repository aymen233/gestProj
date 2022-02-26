package com.bezkoder.springjwt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bezkoder.springjwt.models.SprintBacklog;

@Repository
public interface SprintBacklogRepository extends CrudRepository<SprintBacklog, Integer> {
	@Query(value = "select*  from gestionprojet.sprint_backlog, gestionprojet.user_story where  user_story.sprint_backlog_id=sprint_backlog.id and user_story.projet_id=?1 and sprint_backlog.etat!='TERMINÉ'", nativeQuery = true)
	List<SprintBacklog> getAllSprint(Integer idProjet);
	@Query(value = "SELECT * FROM gestion_proj.sprint_backlog where projet_id =?1",nativeQuery = true)
	List<SprintBacklog>getSprintBacklogByiDProject (Integer idProject);
}

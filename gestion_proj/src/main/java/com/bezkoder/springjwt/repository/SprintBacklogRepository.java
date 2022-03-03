package com.bezkoder.springjwt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bezkoder.springjwt.models.SprintBacklog;

import javax.transaction.Transactional;

@Repository
public interface SprintBacklogRepository extends CrudRepository<SprintBacklog, Integer> {

	@Query(value = "select*  from gestionprojet.sprint_backlog where proj_id=?1 and sprint_backlog.etat!='TERMINÉ'", nativeQuery = true)
	List<SprintBacklog> getAllSprint(Integer idProjet);
	@Query(value = "select*  from gestionprojet.sprint_backlog where proj_id=?1 and sprint_backlog.etat='DEMARRÉ'", nativeQuery = true)
	List<SprintBacklog> getDemarreSprint(Integer idProjet);




	@Query(value = "SELECT * FROM gestionprojet.sprint_backlog where projet_id =?1",nativeQuery = true)
	List<SprintBacklog>getSprintBacklogByiDProject (Integer idProject);


	@Query(value = "select*  from gestionprojet.sprint_backlog where  projet_id=?1 and sprint_backlog.etat='DEMARRÉ'", nativeQuery = true)
	List<SprintBacklog> getAllSprintByEtat(Integer idProjet);
	@Modifying
	@Transactional
	@Query(value = "UPDATE gestionprojet.sprint_backlog SET sprint_backlog.etat='DEMARRÉ' where id=?1", nativeQuery = true)
	void  demmareSprintBacklog(Integer idSprint);

}

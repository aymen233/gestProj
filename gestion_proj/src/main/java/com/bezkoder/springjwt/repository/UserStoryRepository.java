package com.bezkoder.springjwt.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bezkoder.springjwt.models.EtatUserStory;
import com.bezkoder.springjwt.models.UserStory;

@Repository
public interface UserStoryRepository extends CrudRepository<UserStory, Integer> {

	public List<UserStory> findByProjetId(Integer id);

	public List<UserStory> findBySprintBacklogId(Integer idbacklog);

	@Modifying
	@Transactional
	@Query(value = "Update user_story SET avancement=?2 WHERE	id=?1 ", nativeQuery = true)
	void updateEtatUserStory(Integer id, EtatUserStory avancement);

	@Query(value = "Update user_story SET sprint_backlog_id=?1 WHERE id=?2 ", nativeQuery = true)
	void updateSprintIdUserStory(Integer idSprint, Integer id);

}

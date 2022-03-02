package com.bezkoder.springjwt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bezkoder.springjwt.models.UserStory;

import javax.transaction.Transactional;

@Repository
public interface UserStoryRepository extends CrudRepository<UserStory, Integer> {

	public List<UserStory> findByProjetId(Integer id);

	public List<UserStory> findBySprintBacklogId(Integer idbacklog);

	@Modifying
	@Transactional
	@Query(value = "DELETE FROM user_story WHERE user_story.sprint_backlog_id=?1 and user_story.projet_id=?2 ", nativeQuery = true)
	Integer deleteUserstory(Integer sprintBacklogId,Integer idProjet);
	@Query(value = "Select * FROM user_story WHERE user_story.sprint_backlog_id=?1 and user_story.projet_id=?2 ", nativeQuery = true)
	List<UserStory> getUserstoriesByIdSprintBacklog(Integer sprintBacklogId,Integer idProjet);

	/*
	 * @Query(value = "Update user_story SET projet=?, nativeQuery = true) void
	 * updateEtatUserStory(Integer id);
	 */
}

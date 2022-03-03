package com.bezkoder.springjwt.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bezkoder.springjwt.models.UserStory;

@Repository
public interface UserStoryRepository extends CrudRepository<UserStory, Integer> {
	@Query(value = "select * from  user_story WHERE sprint_backlog_id is NULL;", nativeQuery = true)
	public List<UserStory> findByProjetId(Integer id);


	public List<UserStory> findBySprintBacklogId(Integer idbacklog);

<<<<<<< Updated upstream
	/*
	 * @Query(value = "Update user_story SET projet=?, nativeQuery = true) void
	 * updateEtatUserStory(Integer id);
	 */
=======
	@Modifying
	@Transactional
	@Query(value = "Update user_story SET avancement=?2 WHERE	id=?1 ", nativeQuery = true)
	void updateEtatUserStory(Integer id, EtatUserStory avancement);
	@Modifying
	@Transactional
	@Query(value = "Update user_story SET sprint_backlog_id=?1 WHERE id=?2 ", nativeQuery = true)
	void updateSprintIdUserStory(Integer idSprint, Integer id);
	@Modifying
	@Transactional
	@Query(value = "Update user_story SET sprint_backlog_id=null WHERE id=?1 ", nativeQuery = true)
	void resetuserStory(Integer idSprint);
	@Modifying
	@Transactional
	@Query(value = "DELETE FROM user_story WHERE user_story.sprint_backlog_id=?1  ", nativeQuery = true)
	Integer deleteUserstory(Integer sprintBacklogId);


	@Query(value = "select * from  user_story WHERE sprint_backlog_id=?1 and avancement='À_FAIRE';", nativeQuery = true)
	public List<UserStory> findTodoStory(Integer id);
	@Query(value = "select * from  user_story WHERE sprint_backlog_id=?1 and avancement='EN_COURS';", nativeQuery = true)
	public List<UserStory> finddoingStory(Integer id);
	@Query(value = "select * from  user_story WHERE sprint_backlog_id=?1 and avancement='TERMINÉ';", nativeQuery = true)
	public List<UserStory> findDoneStory(Integer id);

>>>>>>> Stashed changes
}

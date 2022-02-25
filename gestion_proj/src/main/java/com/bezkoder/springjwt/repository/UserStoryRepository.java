package com.bezkoder.springjwt.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bezkoder.springjwt.models.UserStory;

@Repository
public interface UserStoryRepository extends CrudRepository<UserStory, Integer> {

	public List<UserStory> findByProjetId(Integer id);

	public List<UserStory> findBySprintBacklogId(Integer idbacklog);

	/*
	 * @Query(value = "Update user_story SET projet=?, nativeQuery = true) void
	 * updateEtatUserStory(Integer id);
	 */
}

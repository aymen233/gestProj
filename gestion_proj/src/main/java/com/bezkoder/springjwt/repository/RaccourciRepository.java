package com.bezkoder.springjwt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bezkoder.springjwt.models.Raccourci;

@Repository
public interface RaccourciRepository extends JpaRepository<Raccourci, Integer> {
	@Query(value = "SELECT * FROM raccourci where projet_id=:id", nativeQuery = true)
	public List<Raccourci> findRaccourciByIdProject(@Param("id") Integer id);
}

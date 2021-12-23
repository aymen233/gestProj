package com.bezkoder.springjwt.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bezkoder.springjwt.models.Projet;

@Repository
public interface ProjetRepository extends CrudRepository<Projet, Integer> {

	public List<Projet> findByUserId(Long id);
}

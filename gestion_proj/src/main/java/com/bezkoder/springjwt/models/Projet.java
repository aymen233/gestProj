package com.bezkoder.springjwt.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Projet {
	@Id
	@GeneratedValue
	private Integer id;
	private String nom;
	@ManyToMany
	private List<User> user;

	@JsonIgnore
	@OneToMany(mappedBy = "proj")
	private List<SprintBacklog> sprintBacklog;
	@JsonIgnore
	@OneToMany(mappedBy = "projet")
	private List<UserStory> userStory;
	@JsonIgnore
	@OneToMany(mappedBy = "project")
	private List<Raccourci> raccourci;

}

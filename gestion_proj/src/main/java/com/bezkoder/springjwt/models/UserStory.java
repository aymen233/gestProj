package com.bezkoder.springjwt.models;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserStory {
	@Id
	@GeneratedValue
	private Integer id;
	private String nom;
	@Enumerated(EnumType.STRING)
	private EtatUserStory avancement;
	@ManyToOne
	private Projet projet;
	@ManyToOne
	private SprintBacklog sprintBacklog;
}

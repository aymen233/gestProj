package com.bezkoder.springjwt.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class SprintBacklog {
	@Id
	@GeneratedValue
	private Integer id;
	private String nom;
	@Enumerated(EnumType.STRING)
	private EtatSprint etat;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date dateDebut;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date dateFin;
	@JsonIgnore
	@OneToMany(mappedBy = "sprintBacklog")
	private List<UserStory> userStory;
	@ManyToOne
	private Projet projet;

}

package com.bezkoder.springjwt.models;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

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
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dateDebut;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dateFin;
	@JsonIgnore
	@OneToMany(mappedBy = "sprintBacklog")
	private List<UserStory> userStory;
	@ManyToOne
	private Projet proj;

}

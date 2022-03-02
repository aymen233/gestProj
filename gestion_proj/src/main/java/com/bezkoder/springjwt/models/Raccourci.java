package com.bezkoder.springjwt.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Raccourci {
	@Id
	@GeneratedValue
	private Integer id;
	private String nomRaccourci;
	private String lien;
	@ManyToOne
	private Projet projet;
}

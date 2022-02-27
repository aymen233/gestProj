package com.bezkoder.springjwt.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Raccourci {
//model
    @Id
    @GeneratedValue
    private Integer id;
    private String  nomRaccourci;
    private String lien ;

    @ManyToOne
    private Projet projet;
}

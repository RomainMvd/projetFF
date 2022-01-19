package com.inti.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Evaluation implements Serializable {

	private Long noteCours;
	private String commentaire;

	@ManyToOne
	@JoinColumn(name = "id_cours")
	private Cours cours;

	public Evaluation() {

	}
	
	
}

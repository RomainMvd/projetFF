package com.inti.entities;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Enseignant extends Personne{
	private double salaire;

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	public Enseignant(String nomPersonne, String prenomPersonne, Date dateNaissance, String username, String password,
			String email, double salaire) {
		super(nomPersonne, prenomPersonne, dateNaissance, username, password, email);
		this.salaire = salaire;
	}

	public Enseignant() {
		super();
	}
	
	
}

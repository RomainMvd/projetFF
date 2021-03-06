package com.inti.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Cours implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCours;
	private String chapitre;
	private int nbrHeure;
	
	@Lob
	private byte [] fichierCours;
	
	@ManyToOne
	private Matiere matiere;
	
	@OneToMany
	private List<Evaluation> evaluation = new ArrayList<>();
	
	public Cours () {
		
	}

	public Cours(String chapitre, int nbrHeure, byte[] fichierCours) {
		this.chapitre = chapitre;
		this.nbrHeure = nbrHeure;
		this.fichierCours = fichierCours;
	}

	public Long getIdCours() {
		return idCours;
	}

	public void setIdCours(Long idCours) {
		this.idCours = idCours;
	}

	public String getChapitre() {
		return chapitre;
	}

	public void setChapitre(String chapitre) {
		this.chapitre = chapitre;
	}

	public int getNbrHeure() {
		return nbrHeure;
	}

	public void setNbrHeure(int nbrHeure) {
		this.nbrHeure = nbrHeure;
	}

	public byte[] getFichierCours() {
		return fichierCours;
	}

	public void setFichierCours(byte[] fichierCours) {
		this.fichierCours = fichierCours;
	}

	public Matiere getMatiere() {
		return matiere;
	}

	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}

	@Override
	public String toString() {
		return "Cours [idCours=" + idCours + ", chapitre=" + chapitre + ", nbrHeure=" + nbrHeure + ", fichierCours="
				+ Arrays.toString(fichierCours) + "]";
	}
	
	

}

package fr.eni.bo;

import java.util.ArrayList;
import java.util.Date;

public class Film {
	
	private String titre;
	
	private Date anneDeSortie;
	
	private Integer duree;
	
	private ArrayList<Personne> acteurs;
	
	private Personne realisateur;
	
	private Genre genre;

	public ArrayList<Personne> getActeurs() {
		return acteurs;
	}

	public void setActeurs(ArrayList<Personne> acteurs) {
		this.acteurs = acteurs;
	}

	public Personne getRealisateur() {
		return realisateur;
	}

	public void setRealisateur(Personne realisateur) {
		this.realisateur = realisateur;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public Date getAnneDeSortie() {
		return anneDeSortie;
	}

	public void setAnneDeSortie(Date anneDeSortie) {
		this.anneDeSortie = anneDeSortie;
	}

	public Integer getDuree() {
		return duree;
	}

	public void setDuree(Integer duree) {
		this.duree = duree;
	}

}

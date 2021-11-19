package fr.eni.bo;

import java.util.ArrayList;
import java.util.Date;

public class Film {
	
	public Film() {
		
	}
	
	public Film(String titre, String anneDeSortie, Integer duree, ArrayList<Personne> acteurs, Personne realisateur,
			Genre genre, String synopsis) {
		super();
		this.titre = titre;
		this.anneDeSortie = anneDeSortie;
		this.duree = duree;
		this.acteurs = acteurs;
		this.realisateur = realisateur;
		this.genre = genre;
		this.synopsis = synopsis;
	}

	public Film(String titre, String anneDeSortie, Integer duree) {
		super();
		this.titre = titre;
		this.anneDeSortie = anneDeSortie;
		this.duree = duree;
	}

	public Film(String titre2) {
		this.titre = titre2;
	}

	private String titre;
	
	private String anneDeSortie;
	
	private Integer duree;
	
	private ArrayList<Personne> acteurs;
	
	private Personne realisateur;
	
	private Genre genre;
	
	private String synopsis;

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

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

	public String getAnneDeSortie() {
		return anneDeSortie;
	}

	public void setAnneDeSortie(String anneDeSortie) {
		this.anneDeSortie = anneDeSortie;
	}

	public Integer getDuree() {
		return duree;
	}

	public void setDuree(Integer duree) {
		this.duree = duree;
	}

}

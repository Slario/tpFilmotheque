package fr.eni.bo;

import java.util.Date;

public class Film {
	
	private String titre;
	
	private Date anneDeSortie;
	
	private Integer duree;

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

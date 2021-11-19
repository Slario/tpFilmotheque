package fr.eni.services;

import fr.eni.bo.Film;

public class FilmServiceImpl implements FilmService{
	
	
	@Override
	public Film detail(String titre) {
		Film titreFilm = new Film(titre);
		return titreFilm;
	}


}

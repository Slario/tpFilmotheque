package fr.eni.services;

import org.springframework.stereotype.Service;

import fr.eni.bo.Film;

@Service
public class FilmServiceImpl implements FilmService{
	
	
	@Override
	public Film detail(String titre) {
		Film filmAvecDetails = new Film(titre);
		
		
		return filmAvecDetails;
	}


}

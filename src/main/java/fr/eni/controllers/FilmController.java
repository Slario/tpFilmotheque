package fr.eni.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import fr.eni.bo.Film;
import fr.eni.bo.Genre;
import fr.eni.services.FilmService;

@Controller
@RequestMapping("/film")
@SessionAttributes({"films", "genres"})
public class FilmController {
	
	@Autowired
private FilmService filmService;
	
	@ModelAttribute("films")
	public ArrayList<Film> getFilms(){
		ArrayList<Film> retour = new ArrayList<Film>();
        
		Film terminator = new Film("Terminator", "1997", 120);
		Film matrix = new Film("Matrix", "2003", 180);
		Film tarzan = new Film("Tarzan", "1985", 150);

		retour.add(terminator);
		retour.add(matrix);
		retour.add(tarzan);
		
		return retour;
		
	}
	
	@ModelAttribute("genres")
	public ArrayList<Genre> getGenres(){
		ArrayList<Genre> retour = new ArrayList<Genre>();
        
		Genre genre1 = new Genre("Horreur");
		retour.add(genre1);
		
		return retour;
		
	}
	
	@GetMapping({"/", "/index", ""})
	public String index(Model model) {
		
		return "Film/index";
	}
	
	@GetMapping("/detail")
	public String detailFilm(String titre, Model model) {
		Film detailFilm = filmService.detail(titre);
		model.addAttribute("detailFilm", detailFilm);
		return "Film/detailFilm" ; 
	}
	
	@GetMapping({"/new"})
	public String newFilmGet(Model model) {
		
		return "Film/new";
	}
	
	@PostMapping({"/new"})
	public String newFilmPost(Model model) {
		
		//TODO : gestion de la réception du formulaire de création d'un film
		
		return "redirect:Film/index";
	}
		

}

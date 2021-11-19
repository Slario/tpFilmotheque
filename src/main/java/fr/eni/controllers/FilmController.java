package fr.eni.controllers;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import fr.eni.bo.Film;
import fr.eni.services.FilmService;

@Controller
@RequestMapping("/film")
@SessionAttributes("films")
public class FilmController {
	
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
	
	@GetMapping({"/", "/index", ""})
	public String index(Model model) {
		
		return "Film/index";
	}
	
	@GetMapping("/detail")
	public String detailFilm(@RequestParam String titre, Model model) {
		Film detailFilm = filmService.detail(titre);
		model.addAttribute("detailFilm", detailFilm);
		return "detailFilm" ; 
	}
	
	@GetMapping({"/new"})
	public String newFilmGet(Model model) {
		
		
		
		return "Film/new";
	}
	
	@PostMapping({"/new"})
	public String newFilmPost(Model model) {
		
		
		
		return "redirect:Film/index";
	}
		

}

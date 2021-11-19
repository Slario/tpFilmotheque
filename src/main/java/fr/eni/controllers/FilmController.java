package fr.eni.controllers;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import fr.eni.bo.Film;

@Controller
@RequestMapping("/film")
@SessionAttributes("films")
public class FilmController {
	
	
	@ModelAttribute("films")
	public ArrayList<Film> getFilms(){
		ArrayList<Film> retour = new ArrayList<Film>();
		Film terminator = new Film("Terminator", new Date(), 120);
		Film matrix = new Film("Matrix", new Date(), 180);
		Film tarzan = new Film("Tarzan", new Date(), 150);

		retour.add(terminator);
		retour.add(matrix);
		retour.add(tarzan);
		
		return retour;
	}
	
	@GetMapping({"/", "/index", ""})
	public String index(Model model) {
		
		return "Film/index";
	}

}

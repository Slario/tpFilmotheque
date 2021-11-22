package fr.eni.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import fr.eni.bo.Avis;
import fr.eni.bo.Film;
import fr.eni.bo.Genre;
import fr.eni.bo.Personne;

@Controller
@RequestMapping("/avis")
@SessionAttributes({"films", "genres", "acteurs", "realisateurs", "listeAvis"})
public class AvisController {
	

	
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
	
	@ModelAttribute("acteurs")
	public ArrayList<Personne> getActeurs(){
		ArrayList<Personne> acteurs = new ArrayList<Personne>();
        
		Personne bPitt = new Personne("Pitt", "Brad");
		Personne depardieu = new Personne("Depardieu", "Gérard");
		Personne cassel = new Personne("Cassel", "Vincent");
		Personne caprio = new Personne("DiCaprio", "Leonardo");
		Personne delon = new Personne("Delon", "Alain");
		Personne hardy = new Personne("Hardy", "Tom");

		acteurs.add(bPitt);
		acteurs.add(delon);
		acteurs.add(depardieu);
		acteurs.add(caprio);
		acteurs.add(cassel);
		acteurs.add(hardy);
	
		return acteurs;
		
	}
	
	@ModelAttribute("realisateurs")
	public ArrayList<Personne> getRealisateurs(){
		
		ArrayList<Personne> realisateurs = new ArrayList<Personne>();	
		Personne scors = new Personne("Scorsese", "Martin");
		Personne godard = new Personne("Godard", "Jean-Luc");
		Personne spiel = new Personne("Spielberg", "Steven");
		Personne tarant = new Personne("Tarantino", "Quentin");
		Personne lynch = new Personne("Lynch", "David");
		Personne allen = new Personne("Allen", "Woody");

		realisateurs.add(scors);
		realisateurs.add(godard);
		realisateurs.add(spiel);
		realisateurs.add(tarant);
		realisateurs.add(lynch);
		realisateurs.add(allen);
	
		return realisateurs;
		
	}
	
	@ModelAttribute("genres")
	public ArrayList<Genre> getGenres(){
		ArrayList<Genre> retour = new ArrayList<Genre>();
        
		Genre genre1 = new Genre("Horreur");
		retour.add(genre1);
		
		return retour;
		
	}
	
	@ModelAttribute("listeAvis")
	public ArrayList<Avis> initListeAvis() {
		return new ArrayList<Avis>();
	}
	
	@GetMapping({ "/editer"})
	public String afficherFormulaire(Model model) {
		model.addAttribute("avis", new Avis());
		return "Film/avis";
	}

	@PostMapping("/post")
	public String ajoutAvis(@ModelAttribute("avis") Avis avis, @ModelAttribute("listeAvis") List<Avis> listeAvis) {
		listeAvis.add(avis);
		return "Film/index";
	}

	@GetMapping("/listeAvis")
	public String afficherListeAvis() {
		return "Film/index";
	}
}

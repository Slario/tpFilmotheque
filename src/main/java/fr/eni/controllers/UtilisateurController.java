package fr.eni.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UtilisateurController {
	
	@GetMapping("/")
	public String index() {
		
		return "Utilisateur/indexUserView";
	}

}

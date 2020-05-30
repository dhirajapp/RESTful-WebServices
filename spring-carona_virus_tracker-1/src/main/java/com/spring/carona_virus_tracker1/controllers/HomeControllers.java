package com.spring.carona_virus_tracker1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.spring.carona_virus_tracker1_service.Caronavirus_data;

@Controller
public class HomeControllers {
	
	  @Autowired(required=false) 
	  private Caronavirus_data caronavirus_data;
	 
	
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("LocationStats",caronavirus_data.getAllStats());
		return "home";
	}

}

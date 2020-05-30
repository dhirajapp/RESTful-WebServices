package com.code4dhiraj;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlienResourse {
	
	@RequestMapping("/aliens")
 public List<Alien> getAliens()
 {
	 List<Alien> aliens = new ArrayList<>();
	  Alien a=new Alien();
	  a.setId(10);
	 a.setName("dhiraj");
	 a.setPoints(70);
	 
	 
	 Alien a1=new Alien();
	  a1.setId(11);
	 a1.setName("niraj");
	 a1.setPoints(75);
	 
	 aliens.add(a);
	 aliens.add(a1);
	 
	 return aliens;
 }
}

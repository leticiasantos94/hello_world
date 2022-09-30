package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Objetivos-de-Aprendizagem")
public class ObjetivosAprendizagemController {

	@GetMapping
	public String MeusObjetivos() {
		return "<br>Revisar assuntos que não entendi<br>"
				+ "<br>Entregar atividades atrasadas<br>"
				+ "<br>Estudar pdf01<br>";
		
	}
}

package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/BSMs-Generetion")
public class BSMsGenerationController {

	@GetMapping
	public String[] BSMGeneration() {
			String[] StringArray = {"Orientação ao futuro"
					+ "Responsabilidade pessoal"
					+ "Mentalidade de crescimento"
					+ "Persistência,Trabalho em equip"
					+ "Atenção aos Detalhes"
					+ "Proatividade"
					+ "Comunicação"};
			return StringArray;
				
	}
	
}


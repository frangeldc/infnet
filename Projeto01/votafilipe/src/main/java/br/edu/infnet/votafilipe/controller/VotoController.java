package br.edu.infnet.votafilipe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.votafilipe.model.domain.Voto;

@Controller
public class VotoController {
	
	@GetMapping(value = "/voto")
	public String cadastro() {
		return "voto/cadastro";
	}

	@PostMapping(value = "/voto/incluir")
	public String incluir(Voto voto) {
		
		System.out.println("Inclusão realizada com sucesso.");
		
		return "redirect:/";
	}
}

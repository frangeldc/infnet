package br.edu.infnet.votafilipe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.votafilipe.model.domain.Eleitor;
import br.edu.infnet.votafilipe.model.domain.service.EleitorService;

@Controller
public class EleitorController {
	
	@Autowired
	private EleitorService eleitorService;
	
	@GetMapping(value = "/eleitor")
	public String cadastro() {
		return "eleitor/cadastro";
	}

	@PostMapping(value = "/eleitor/incluir")
	public String incluir(Eleitor eleitor) {
		
		System.out.println("Inclusão realizada com sucesso.");
		
		return "redirect:/";
	}
}

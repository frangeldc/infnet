package br.edu.infnet.votafilipe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.votafilipe.model.domain.Candidato;
import br.edu.infnet.votafilipe.model.domain.service.CandidatoService;

@Controller
public class CandidatoController {
	
	@Autowired
	private CandidatoService candidatoService;
	
	@GetMapping(value = "/candidato")
	public String cadastro() {
		return "candidato/cadastro";
	}

	@PostMapping(value = "/candidato/incluir")
	public String incluir(Candidato candidato) {
		
		System.out.println("Inclusão realizada com sucesso." + candidato.getNome());
		
		return "redirect:/";
	}
}

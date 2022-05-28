package br.edu.infnet.votafilipe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.votafilipe.model.domain.Eleicao;
import br.edu.infnet.votafilipe.model.domain.service.EleicaoService;

@Controller
public class EleicaoController {
	
	@Autowired
	private EleicaoService eleicaoService;
	
	@GetMapping(value = "/eleicao")
	public String cadastro() {
		return "eleicao/cadastro";
	}

	@PostMapping(value = "/eleicao/incluir")
	public String incluir(Eleicao eleicao) {
		
		System.out.println("Inclusão realizada com sucesso.");
		
		return "redirect:/";
	}
}

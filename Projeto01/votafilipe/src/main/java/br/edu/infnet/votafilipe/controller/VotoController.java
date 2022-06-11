package br.edu.infnet.votafilipe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.votafilipe.model.domain.Voto;
import br.edu.infnet.votafilipe.model.domain.service.CandidatoService;
import br.edu.infnet.votafilipe.model.domain.service.EleicaoService;
import br.edu.infnet.votafilipe.model.domain.service.EleitorService;
import br.edu.infnet.votafilipe.model.domain.service.VotoService;

@Controller
public class VotoController {

	@Autowired
	private VotoService votoService;
	@Autowired
	private EleicaoService eleicaoService;
	@Autowired
	private CandidatoService candidatoService;
	@Autowired
	private EleitorService eleitorService;

	@GetMapping(value = "/voto")
	public String cadastro(Model model) {
		
		model.addAttribute("eleitores", eleitorService.obterLista());
		
		return "voto/cadastro";
	}
	
	@GetMapping(value = "/votos")
	public String lista(Model model) {
		
		model.addAttribute("lista", votoService.obterLista());
		
		return "voto/lista";
	}

	@PostMapping(value = "/voto/incluir")
	public String incluir(Voto voto) {
		votoService.incluir(voto);
		return "redirect:/votos";
	}
	
	@GetMapping(value = "/voto/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		votoService.excluir(id);
		return "redirect:/votos";
	}
}

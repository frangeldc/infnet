package br.edu.infnet.votafilipe.model.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.votafilipe.model.domain.Candidato;
import br.edu.infnet.votafilipe.model.domain.Eleicao;
import br.edu.infnet.votafilipe.model.repository.CandidatoRepository;

public class CandidatoService {
	@Autowired
	private CandidatoRepository candidatoRepository;
	
	public void incluir(Candidato candidato) {
		candidatoRepository.save(candidato);
	}
	
	@GetMapping(value = "/candidato/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		//candidatoService.excluir(id);
		
		return "redirect:/candidatos";
	}
	
	public List<Candidato> obterLista(){
		return (List<Candidato>) candidatoRepository.findAll();
	}
	
	public List<Candidato> obterLista(Eleicao eleicao){
		return (List<Candidato>) candidatoRepository.findAll();
	}

}

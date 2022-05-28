package br.edu.infnet.votafilipe.model.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.edu.infnet.votafilipe.model.domain.Candidato;
import br.edu.infnet.votafilipe.model.domain.Voto;
import br.edu.infnet.votafilipe.model.repository.VotoRepository;

public class VotoService {

	@Autowired
	private VotoRepository votoRepository;
	
	public void incluir(Voto voto) {
		votoRepository.save(voto);
	}
	
	public List<Voto> obterLista(){
		return (List<Voto>) votoRepository.findAll();
	}

}

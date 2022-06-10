package br.edu.infnet.votafilipe.model.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.edu.infnet.votafilipe.model.domain.Candidato;
import br.edu.infnet.votafilipe.model.domain.Eleitor;
import br.edu.infnet.votafilipe.model.repository.EleitorRepository;

public class EleitorService {

	@Autowired
	private EleitorRepository eleitorRepository;
	
	public void incluir(Eleitor eleitor) {
		eleitorRepository.save(eleitor);
	}
	
	public List<Eleitor> obterLista(){
		return (List<Eleitor>) eleitorRepository.findAll();
	}

}

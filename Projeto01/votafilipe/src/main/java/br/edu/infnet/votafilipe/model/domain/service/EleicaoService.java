package br.edu.infnet.votafilipe.model.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.votafilipe.model.domain.Eleicao;
import br.edu.infnet.votafilipe.model.repository.EleicaoRepository;

@Service
public class EleicaoService {

	@Autowired
	private EleicaoRepository eleicaoRepository;
	
	public void incluir(Eleicao eleicao) {
		eleicaoRepository.save(eleicao);
	}
	
	public void excluir(Integer id) {
		eleicaoRepository.deleteById(id);
	}
	
	public List<Eleicao> obterLista(){
		return (List<Eleicao>) eleicaoRepository.findAll();
	}
	
	public Eleicao obterPorId(Integer Id) {
		return  eleicaoRepository.findById(Id).orElse(null);
	}

}

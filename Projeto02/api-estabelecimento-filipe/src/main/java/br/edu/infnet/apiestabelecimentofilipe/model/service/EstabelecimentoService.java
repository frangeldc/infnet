package br.edu.infnet.apiestabelecimentofilipe.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.apiestabelecimentofilipe.model.domain.Estabelecimento;
import br.edu.infnet.apiestabelecimentofilipe.model.repository.EstabelecimentoRepository;

@Service
public class EstabelecimentoService {

	@Autowired
	EstabelecimentoRepository estabelecimentoRepository;
	
	public void incluir(Estabelecimento estabelecimento) {
		estabelecimentoRepository.save(estabelecimento);
	}
}

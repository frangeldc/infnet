package br.edu.iinfnet.apiestabelecimentofilipe.model.service;

import org.springframework.beans.factory.annotation.Autowired;

import br.edu.iinfnet.apiestabelecimentofilipe.model.domain.Estabelecimento;
import br.edu.iinfnet.apiestabelecimentofilipe.model.repository.EstabelecimentoRepository;

public class EstabelecimentoService {

	@Autowired
	EstabelecimentoRepository estabelecimentoRepository;
	
	public void incluir(Estabelecimento estabelecimento) {
	}
}

package br.edu.iinfnet.apiestabelecimentofilipe.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.edu.iinfnet.apiestabelecimentofilipe.model.domain.Funcionario;
import br.edu.iinfnet.apiestabelecimentofilipe.model.repository.FuncionarioRepository;

public class FuncionarioService {

	@Autowired
	private FuncionarioRepository funcionarioRepository;
	
	public List<Funcionario> obterLista(Integer idEstabelecimento){
		return null;
	}
	
	public void incluir(Funcionario funcionario) {
		
	}
}

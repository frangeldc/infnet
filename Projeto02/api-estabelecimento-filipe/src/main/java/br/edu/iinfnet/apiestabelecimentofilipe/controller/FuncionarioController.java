package br.edu.iinfnet.apiestabelecimentofilipe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.edu.iinfnet.apiestabelecimentofilipe.model.domain.Funcionario;
import br.edu.iinfnet.apiestabelecimentofilipe.model.service.FuncionarioService;

public class FuncionarioController {

	@Autowired
	private FuncionarioService funcionarioService;
	
	public List<Funcionario> obterLista(Integer idEstabelecimento){
		return null;
	}
	
	public void incluir(Funcionario funcionario) {}
}

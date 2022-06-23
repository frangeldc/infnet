package br.edu.iinfnet.apiestabelecimentofilipe.controller;

import org.springframework.beans.factory.annotation.Autowired;

import br.edu.iinfnet.apiestabelecimentofilipe.model.domain.Estabelecimento;
import br.edu.iinfnet.apiestabelecimentofilipe.model.service.UsuarioService;

public class EstabelecimentoController {

	@Autowired
	public UsuarioService usuarioService;
	
	public void incluir(Estabelecimento estabelecimento) {}

}

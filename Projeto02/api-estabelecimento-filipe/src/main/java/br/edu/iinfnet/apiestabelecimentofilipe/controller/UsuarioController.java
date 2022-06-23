package br.edu.iinfnet.apiestabelecimentofilipe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.iinfnet.apiestabelecimentofilipe.model.domain.Funcionario;
import br.edu.iinfnet.apiestabelecimentofilipe.model.domain.Usuario;
import br.edu.iinfnet.apiestabelecimentofilipe.model.service.UsuarioService;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {
	
	@Autowired
	public UsuarioService usuarioService;
	
	public  Usuario validar(String login, String senha) {
		return usuarioService.validar(login, senha);
	}
	
	public void excluir(String id) {
		usuarioService.excluir(id);
	}
	
	public List<Usuario> obterLista(Integer idEstabelecimento){
		return usuarioService.obterLista();
	}
}

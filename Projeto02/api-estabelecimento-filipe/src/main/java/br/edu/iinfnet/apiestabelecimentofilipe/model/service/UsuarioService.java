package br.edu.iinfnet.apiestabelecimentofilipe.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.iinfnet.apiestabelecimentofilipe.model.domain.Funcionario;
import br.edu.iinfnet.apiestabelecimentofilipe.model.domain.Usuario;
import br.edu.iinfnet.apiestabelecimentofilipe.model.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public Usuario validar(String login, String senha) {
		return null;
	}

	public void excluir(String id) {
	}
	
	@GetMapping(value = "/listar")
	public List<Usuario> obterLista(Integer idEstabelecimento){
		return null;
	}
	
}

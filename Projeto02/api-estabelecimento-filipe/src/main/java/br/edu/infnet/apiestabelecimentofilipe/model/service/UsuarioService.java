package br.edu.infnet.apiestabelecimentofilipe.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.apiestabelecimentofilipe.model.domain.Usuario;
import br.edu.infnet.apiestabelecimentofilipe.model.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public Usuario validar(String login, String senha) {
		return usuarioRepository.validar(login, senha);
	}

	public void excluir(Integer id) {
		usuarioRepository.deleteById(id);
	}
	
	@GetMapping(value = "/listar")
	public List<Usuario> obterLista(Integer idEstabelecimento){
		return (List<Usuario>)usuarioRepository.findAll();
	}
	
}

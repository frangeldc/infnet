package br.edu.infnet.apiestabelecimentofilipe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.apiestabelecimentofilipe.model.domain.Usuario;
import br.edu.infnet.apiestabelecimentofilipe.model.service.UsuarioService;

@Component
public class UsuarioLoader implements ApplicationRunner {

	@Autowired
	public UsuarioService usuarioService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Execucao usuario loader");

		Usuario usuario = usuarioService.validar("f12345678900", "123");

		usuarioService.excluir(usuario.getId());
		
		System.out.println("Exclusão realizada com sucesso do usuário: " + usuario.getLogin());

	}

}

package br.edu.iinfnet.apiestabelecimentofilipe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.iinfnet.apiestabelecimentofilipe.model.domain.Estabelecimento;
import br.edu.iinfnet.apiestabelecimentofilipe.model.service.EstabelecimentoService;

@Component
public class EstabelecimentoLoader implements ApplicationRunner {

	@Autowired
	private EstabelecimentoService estabelecimentoService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Estabelecimento estabelecimento = null;
		try {
			estabelecimento  = new Estabelecimento();
			estabelecimento.setCnpj("123456");
			estabelecimento.setEdtech(false);
			estabelecimento.setEndereco("Rua 1");
			estabelecimento.setNome("infnet");
			estabelecimento.setLogin("login");
			estabelecimento.setSenha("123");

			estabelecimentoService.incluir(estabelecimento);
			
			System.out.println("[SUCESSO] - Inclusão realizada com sucesso do:" + estabelecimento.getNome());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("[ERRO] - Inclusão falhou para:" + estabelecimento.getNome());

		}
	}

}

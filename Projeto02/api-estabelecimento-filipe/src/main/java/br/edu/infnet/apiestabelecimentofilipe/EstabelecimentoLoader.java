package br.edu.infnet.apiestabelecimentofilipe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.apiestabelecimentofilipe.model.domain.Estabelecimento;
import br.edu.infnet.apiestabelecimentofilipe.model.service.EstabelecimentoService;

@Component
public class EstabelecimentoLoader implements ApplicationRunner {

	@Autowired
	private EstabelecimentoService estabelecimentoService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Execucao estabelecimento loader");
		Estabelecimento estabelecimento = null;
		try {
			estabelecimento  = new Estabelecimento();
			estabelecimento.setCnpj("123456");
			estabelecimento.setEdtech(true);
			estabelecimento.setEndereco("Rua 1");
			estabelecimento.setNome("inst. infnet");
			estabelecimento.setLogin("infnet");
			estabelecimento.setSenha("123");

			estabelecimentoService.incluir(estabelecimento);
			
			System.out.println("[SUCESSO] - Inclusão realizada com sucesso do estabelecimento: " + estabelecimento.getNome());
		} catch (Exception e) {
			System.out.println("[ERRO] - Inclusão falhou para:" + estabelecimento.getNome());
		}
	}

}

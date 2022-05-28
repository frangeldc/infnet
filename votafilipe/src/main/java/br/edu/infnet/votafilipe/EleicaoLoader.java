package br.edu.infnet.votafilipe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.votafilipe.model.domain.Eleicao;
import br.edu.infnet.votafilipe.model.repository.EleicaoRepository;

@Component
public class EleicaoLoader implements ApplicationRunner {

	@Autowired
	private EleicaoRepository eleicaoRepository;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Eleicao eleicao = new Eleicao();
		eleicao.setDescricao("Descricao da eleicao");
		
		try {
			eleicaoRepository.save(eleicao);
			System.out.println("Sucesso. Inclusão da eleicao realizada.");
		} catch (Exception e) {
			System.out.println("[ERRO]" + e.getMessage());
		}

	}

}

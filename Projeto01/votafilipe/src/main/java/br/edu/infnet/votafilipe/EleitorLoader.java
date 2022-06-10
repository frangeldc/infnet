package br.edu.infnet.votafilipe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.votafilipe.model.domain.Eleitor;
import br.edu.infnet.votafilipe.model.repository.EleitorRepository;

@Component
public class EleitorLoader implements ApplicationRunner {

	@Autowired
	private EleitorRepository eleitorRepository;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Eleitor eleitor = new Eleitor();
		eleitor.setCodigo("codigo 252");
		
		try {
			eleitorRepository.save(eleitor);
			System.out.println("Sucesso. Inclusão do eleitor realizada.");
		} catch (Exception e) {
			System.out.println("[ERRO]" + e.getMessage());
		}

	}

}

package br.edu.infnet.votafilipe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.votafilipe.model.domain.Eleitor;
import br.edu.infnet.votafilipe.model.domain.service.EleitorService;

@Component
public class EleitorLoader implements ApplicationRunner {

	@Autowired
	private EleitorService eleitorService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Eleitor eleitor = new Eleitor();
		eleitor.setCodigo("codigo 252");
		eleitor.setEmail("eleitor@email.com");
		eleitor.setNome("ELeitor Filipe");
		eleitor.setTelefone("02112345678");
		eleitor.setToken("Eleitor Token");

		try {
			eleitorService.incluir(eleitor);
			System.out.println("[SUCESSO] Sucesso. Inclusão do eleitor realizada.");
		} catch (Exception e) {
			System.out.println("[ERRO]" + e.getMessage());
		}

	}

}

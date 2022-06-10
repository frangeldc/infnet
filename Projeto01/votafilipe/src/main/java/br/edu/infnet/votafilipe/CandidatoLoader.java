package br.edu.infnet.votafilipe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.votafilipe.model.domain.Candidato;
import br.edu.infnet.votafilipe.model.domain.service.CandidatoService;

@Component
public class CandidatoLoader implements ApplicationRunner {

	@Autowired
	private CandidatoService candidatoService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Candidato candidato = new Candidato();
		candidato.setNome("Candidato Filipe");
		candidato.setNumero(802);
		
		try {
			candidatoService.incluir(candidato);
			System.out.println("Sucesso. Inclusão do candidato realizada.");
		} catch (Exception e) {
			System.out.println("[ERRO]" + e.getMessage());
		}

	}

}

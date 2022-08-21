package br.edu.infnet.apiestabelecimentofilipe;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.apiestabelecimentofilipe.model.domain.Estabelecimento;
import br.edu.infnet.apiestabelecimentofilipe.model.domain.Funcionario;
import br.edu.infnet.apiestabelecimentofilipe.model.service.FuncionarioService;
import br.edu.infnet.apiestabelecimentofilipe.model.service.UsuarioService;

@Component
public class FuncionarioLoader implements ApplicationRunner {

	@Autowired
	private FuncionarioService funcionarioService;

	@Autowired
	public UsuarioService usuarioService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Execucao funcionario loader");

		String cpfs[] = { "12345678900", "12345678901", "12345678902" };
		Funcionario funcionario = null;
		Estabelecimento estabelecimento = (Estabelecimento)usuarioService.validar("infnet", "123");

		for (String cpf : cpfs) {
			try {
				funcionario = new Funcionario();
				funcionario.setCpf(cpf);
				funcionario.setEmail("funcionario@email.com");
				funcionario.setTelefone("21 12345678");
				funcionario.setNome("infnet");
				funcionario.setLogin("f" + cpf);
				funcionario.setSenha("123");
				funcionario.setEstabelecimento(estabelecimento);

				funcionarioService.incluir(funcionario);

				System.out.println("[SUCESSO] - Inclusão realizada com sucesso do funcionario: " + funcionario.getNome()
						+ " com cpf: " + funcionario.getCpf());
			} catch (Exception e) {
				System.out.println("[ERRO] - Inclusão falhou para: " + funcionario.getNome());
			}
		}
		
		System.out.println("[FUNCIONARIOS DO ESTABELECIMNENTO: " + estabelecimento.getNome() + "]");
		
		List<Funcionario> lista = funcionarioService.obterLista(estabelecimento.getId());

		for (Funcionario func : lista) {
			System.out.println("- " + " | " + func.getLogin());
		}

	}
}

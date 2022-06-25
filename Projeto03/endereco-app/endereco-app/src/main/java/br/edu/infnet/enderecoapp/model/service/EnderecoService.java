package br.edu.infnet.enderecoapp.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.enderecoapp.clients.EnderecoClient;
import br.edu.infnet.enderecoapp.clients.ViaCepClient;
import br.edu.infnet.enderecoapp.model.domain.Endereco;

@Service
public class EnderecoService {

	@Autowired
	private EnderecoClient enderecoClient;
	
	@Autowired
	private ViaCepClient viaCepClient;
	

	public List<Endereco> obterLista() {

		return enderecoClient.obterLista();
	}

	public Endereco obterPorCep(String cep) {

		//Endereco endereco = enderecoClient.obterPorCep(cep);
		Endereco endereco = viaCepClient.obterPorCep(cep);
		
		if (endereco == null) {
			return new Endereco(cep);
		} else {
			return endereco;
		}

	}

	public void incluir(Endereco endereco) {
		enderecoClient.incluir(endereco);
	}

	public void excluir(Integer id) {
		enderecoClient.excluir(id);
	}

}

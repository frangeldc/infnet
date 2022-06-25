package br.edu.infnet.enderecoapp.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.enderecoapp.model.domain.Estado;

//https://servicodados.ibge.gov.br/api/v1/localidades/estados
//https://servicodados.ibge.gov.br/api/v1/localidades/estados/{UF}/municipios


@FeignClient(url = "https://servicodados.ibge.gov.br/api/v1/localidades", name = "IBGEClient")
public interface IBGEClient {
	
	@GetMapping(value = "/estados")
	public List<Estado> obterLista();
	
//	@GetMapping(value = "/{cep}/microrregioes")
//	public Endereco obterPorCep(@PathVariable String cep);

}

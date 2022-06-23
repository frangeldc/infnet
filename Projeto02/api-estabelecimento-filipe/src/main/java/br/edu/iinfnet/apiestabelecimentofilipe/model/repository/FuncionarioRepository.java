package br.edu.iinfnet.apiestabelecimentofilipe.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.edu.iinfnet.apiestabelecimentofilipe.model.domain.Funcionario;

public interface FuncionarioRepository extends CrudRepository<Funcionario, Integer> {
//	@Query("from Funcionario f where f.id= :idEstabelecimento")

	@Query("from Funcionario f where f.estabelecimento.id = :idEstabelecimento")
	public List<Funcionario> obterLista(Integer idEstabelecimento);

}

package br.edu.infnet.apivotacao.model.domain.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.votafilipe.model.domain.Voto;

@Repository
public interface VotoRepository extends CrudRepository<Voto, Integer> {

}

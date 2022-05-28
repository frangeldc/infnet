package br.edu.infnet.votafilipe.model.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "TCandidato", uniqueConstraints = @UniqueConstraint(columnNames={"numero"})
)
public class Candidato {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int numero;
	private String nome;
	@Transient
	private List<Eleicao> eleicoes;
	@Transient
	private List<Voto> votos;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Eleicao> getEleicoes() {
		return eleicoes;
	}
	public void setEleicoes(List<Eleicao> eleicoes) {
		this.eleicoes = eleicoes;
	}
	public List<Voto> getVotos() {
		return votos;
	}
	public void setVotos(List<Voto> votos) {
		this.votos = votos;
	}
	
	
}
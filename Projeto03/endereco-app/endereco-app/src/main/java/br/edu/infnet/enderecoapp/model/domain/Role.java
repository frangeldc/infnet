package br.edu.infnet.enderecoapp.model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;

@Entity
@Table(name = "TRole")  // , uniqueConstraints = @UniqueConstraint(columnNames={"email"}
public class Role implements GrantedAuthority{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	
	public Role() {
		// TODO Auto-generated constructor stub
	}
	
	public Role(String nome) {
		this.setNome(nome);
		// TODO Auto-generated constructor stub
	}
	
	public Role(Integer id) {
		this.setId(id);
		// TODO Auto-generated constructor stub
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String getAuthority() {
		return this.nome;

	}
	
	
	
}

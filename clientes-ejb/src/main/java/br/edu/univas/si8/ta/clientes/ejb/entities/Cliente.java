package br.edu.univas.si8.ta.clientes.ejb.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity(name = "clientes")
@SequenceGenerator(name = "seq_clientes",
					sequenceName = "seq_clientes",
					allocationSize = 1)
public class Cliente {

	@Id
	@GeneratedValue(generator = "seq_clientes", strategy = GenerationType.SEQUENCE)
	private Integer id;
	private String nome;
	private String email;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}

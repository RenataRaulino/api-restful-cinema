package br.com.residencia.cinema.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id_Diretor")

@Entity
@Table(name = "diretor")
public class Diretor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_diretor")
	private Integer id_Diretor;

	@Column(name = "nome")
	private String nome;

	@OneToMany(mappedBy = "diretor")
	private Set <Filme> filmes;
	
	public Integer getId_Diretor() {
		return id_Diretor;
	}

	public void setId_Diretor(Integer id_Diretor) {
		this.id_Diretor = id_Diretor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}

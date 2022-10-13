package br.com.residencia.cinema.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id_Filme")

@Entity
@Table(name = "filme")
public class Filme {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = " id_filme")
	private Integer id_Filme;

	@Column(name = "nome_br")
	private String nome_Br;

	@Column(name = "nome_en")
	private String nome_En;

	@Column(name = "ano_lancamento")
	private Integer ano_Lancamento;

	@Column(name = "sinopse")
	private String sinopse;

	@ManyToOne
	@JoinColumn(name = "id_diretor", referencedColumnName = "id_diretor")
	private Diretor diretor;

	@ManyToOne
	@JoinColumn(name = "id_genero", referencedColumnName = "id_genero")
	private Genero genero;

	public Integer getId_Filme() {
		return id_Filme;
	}

	public void setId_Filme(Integer id_Filme) {
		this.id_Filme = id_Filme;
	}

	public String getNome_Br() {
		return nome_Br;
	}

	public void setNome_Br(String nome_Br) {
		this.nome_Br = nome_Br;
	}

	public String getNome_En() {
		return nome_En;
	}

	public void setNome_En(String nome_En) {
		this.nome_En = nome_En;
	}

	public Integer getAno_Lancamento() {
		return ano_Lancamento;
	}

	public void setAno_Lancamento(Integer ano_Lancamento) {
		this.ano_Lancamento = ano_Lancamento;
	}

	public String getSinopse() {
		return sinopse;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

	public Diretor getDiretor() {
		return diretor;
	}

	public void setDiretor(Diretor diretor) {
		this.diretor = diretor;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	
}

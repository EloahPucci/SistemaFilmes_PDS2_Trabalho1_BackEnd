package com.eloahpucci.sistemafilmesfavoritos.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TrilhaSonora implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codigo;
	private String nomeMusica;
	private String filmes;
	
	public TrilhaSonora() {}

	public TrilhaSonora(Integer codigo, String nomeMusica, String filmes) {
		super();
		this.codigo = codigo;
		this.nomeMusica = nomeMusica;
		this.filmes = filmes;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNomeMusica() {
		return nomeMusica;
	}

	public void setNomeMusica(String nomeMusica) {
		this.nomeMusica = nomeMusica;
	}

	public String getFilmes() {
		return filmes;
	}

	public void setFilmes(String filmes) {
		this.filmes = filmes;
	}	
}

package com.eloahpucci.sistemafilmesfavoritos.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UsuarioLogado {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String email;
	private String senha;
	
	public UsuarioLogado() {}

	public UsuarioLogado(String email, String senha) {
		super();
		this.email = email;
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}

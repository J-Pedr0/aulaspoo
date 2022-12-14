package br.org.senai.model;

public class Pessoa {
	private String nome;
	private String email;

	public Pessoa(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", email=" + email + "]";
	}



	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

}

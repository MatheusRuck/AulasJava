package br.fiap.aluno;

import br.fiap.email.Email;

public class Aluno {
	private long rm;
	private String nome;
	private Email email;

	// metodo construtor
	public Aluno(long rm, String nome, String login, String senha) {
		this.rm = rm;
		this.nome = nome;
		email = new Email(login, senha);
	}

	// sobrecarga de metodo (nao era necessario neste exs)
	public Aluno(long rm, String nome) {
		this.rm = rm;
		this.nome = nome;
	}

	public long getRm() {
		return rm;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

}

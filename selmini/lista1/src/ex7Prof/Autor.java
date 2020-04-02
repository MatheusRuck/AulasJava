package ex7Prof;

public class Autor {
	String nome;
	String cidade;
	
	public Autor(String nome, String cidade) {
		this.nome = nome;
		this.cidade = cidade;
	}


	public String retornarDados() {
		return "nome-> " + nome + "\n" + "cidade-> " + cidade;
	}

}

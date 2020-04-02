package ex7Prof;

public class Livro {
	String titulo;
	String genero;
	Autor autor;

	public Livro(String titulo, String genero, String nome, String cidade) {
		this.titulo = titulo;
		this.genero = genero;
		autor = new Autor(nome, cidade);
	}
	public String retornarDados() {
		return "titulo-> " + titulo + "\n" + "genero-> " + genero + "\n" + autor.retornarDados();

	}
}

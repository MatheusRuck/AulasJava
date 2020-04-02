package ex7;

public class Livro {
	String titulo;
	String genero;
	Autor autor = new Autor();
	
	
	public String retornarDados() {
		return "titulo-> " + titulo + "\n" +"genero-> " + genero + "\n" + autor.retornarDados();
		
	}
}
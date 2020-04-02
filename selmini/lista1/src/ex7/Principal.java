package ex7;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Livro livro = new Livro();
		
		System.out.println("Informe o titulo do livro -> ");
		livro.titulo = teclado.nextLine();		
		System.out.println("Informe o genero do livro -> ");
		livro.genero = teclado.nextLine();
		System.out.println("Informe o nome do autor -> ");
		livro.autor.nome = teclado.nextLine();
		System.out.println("Informe a cidade do autor -> ");
		livro.autor.cidade = teclado.nextLine();
		
		System.out.println("\n \n <<<<<<<<<<>>>>>>>>>> \n" + livro.retornarDados());
		
		
		teclado.close();
	}

}

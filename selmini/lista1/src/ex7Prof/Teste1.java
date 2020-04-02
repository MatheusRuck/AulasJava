package ex7Prof;

import java.util.Scanner;

public class Teste1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nome, cidade, titulo, genero;

		System.out.println("Informe o titulo do livro -> ");
		titulo = teclado.nextLine();
		System.out.println("Informe o genero do livro -> ");
		genero = teclado.nextLine();
		System.out.println("Informe o nome do autor -> ");
		nome = teclado.nextLine();
		System.out.println("Informe a cidade do autor -> ");
		cidade = teclado.nextLine();

		Livro livro = new Livro(titulo, genero, nome, cidade);
		System.out.println("\n \n <<<<<<<<<<>>>>>>>>>> \n" + livro.retornarDados());

		teclado.close();

	}

}

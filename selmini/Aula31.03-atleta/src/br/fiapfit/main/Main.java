package br.fiapfit.main;

import br.fiapfit.atleta.Atleta;

public class Main {

	public static void main(String[] args) {
		
		/*ler os dados via teclado. Em seguida, gerar cada objeto e armazenar em um array
		 * 
		 */
		
		Atleta[] lista = new Atleta[3];
		
		lista[0] = new Atleta("matheus", 90, 1.77, 70);
		lista[1] = new Atleta("haha", 90, 1.77, 70);
		lista[2] = new Atleta("kaka", 90, 1.77, 70);

		for (int i = 0; i < lista.length; i++) {
			System.out.println("---------------------");
			System.out.println(lista[i].getNome());
			System.out.println(lista[i].calcularIMC());
			System.out.println(lista[i].calcularBAI());
			System.out.println();
		}
	}

}

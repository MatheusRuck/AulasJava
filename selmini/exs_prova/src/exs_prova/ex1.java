package exs_prova;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		String[] sala = {"1o A", "1o B", "2o A", "3o A"};
		int qtd; // quantidade de chapas
		
		//informa a qtd de chapas
		System.out.println("informe a quantidade de chapas -> ");
		qtd = teclado.nextInt();
		
		//declaracao dos vetores e das matrizes
		String[] chapa = new String[qtd];
		int[][] voto = new int[chapa.length][sala.length];
		
		//metodo para ler as chapas e a quantidade de votos
		lerDados(voto, chapa, sala, teclado);
		
		//impressao dos dados no video
		imprimir(voto, chapa, sala);
		
		teclado.close();
	}
	
	public static void lerDados(int[][] voto, String[] chapa, String[] sala, Scanner teclado) {
		for(int i = 0; i < voto.length; i++) {
			teclado.nextLine();
			System.out.print("informe o nome da chapa -> ");
			chapa[i] = teclado.nextLine();
			for(int j = 0; j < voto[i].length; j++) {
				System.out.print("total de votos na turma "+sala[j]+" -> ");
				voto[i][j] = teclado.nextInt();
			}
			System.out.println();
		}
	}

	public static void imprimir(int[][] voto, String[] chapa, String[] sala) {
		System.out.println("\n");
		System.out.print("Chapa\t");
		for(int i = 0; i < sala.length; i++) {
			System.out.print(sala[i]+"\t");
		}
		System.out.println();
		for(int i = 0; i < voto.length; i++) {
			System.out.print(chapa[i]+"\t");
			for(int j = 0; j < voto[i].length; j++) {
				System.out.print(voto[i][j]+"\t");
			}
			System.out.println();
		}
	}
}

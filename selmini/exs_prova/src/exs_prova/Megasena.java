package exs_prova;

import java.util.Random;
import java.util.Scanner;

public class Megasena {

	public static void main(String[] args) {
		int[] apostas = new int[6];
		int[] Ngerador = new int [6];
		int acertos = 0;
	
		entrada(apostas);
		resultado(Ngerador);
		tabela(apostas);
		comparar(Ngerador, apostas, acertos);

	}

	private static void comparar(int[] Ngerador, int[] apostas, int acertos) {
		for(int i = 0; i < apostas.length; i++) {
			for(int j = 0; j < i; j++) {
				if(apostas[i] == Ngerador[j]) {
					acertos++;
				}
			}
		}
		System.out.println();
		System.out.println("numeros de acertos -> "+ acertos);
		
	}

	private static void tabela(int[] apostas) {		
		//imprime a cartela da mega sena com os numeros apostados
		int aux = 1;
		boolean achou;
		System.out.println("\n");
		for(int i = 1; i <= 6; i++) {
			for(int j = 1; j <= 10; j++) {
				achou = false;
				for(int k = 0; k < apostas.length; k++) {
					if(aux == apostas[k]) {
						achou = true;
					}
				}
				if(achou) {
					System.out.print("X\t");
				}else {
					System.out.print(aux+"\t");
				}
				aux++;
			}
			System.out.println();
		}
		
	}

	private static void resultado(int[] Ngerador) {
		Random gerador = new Random();
		
		for(int i = 0; i < Ngerador.length; i++) {
			
			Ngerador[i] = gerador.nextInt(60)+1;
			
			for(int j = 0; j < i; j++) {
				if(Ngerador[i] == Ngerador[j]) {
					i--;
				}
			}
		}
		
		System.out.println();
		
		System.out.println("---------- números sorteados ---------- ");
		
		for(int i = 0; i < Ngerador.length; i++) {
			System.out.print(Ngerador[i] + " ");
		}
		
		
	}

	private static void entrada(int[] apostas) {
		Scanner teclado = new Scanner (System.in);
		
		for(int i = 0, z = 1; i < apostas.length; i++, z++){
			System.out.print("informe o "+ z+"o números -> ");
			apostas[i] = teclado.nextInt();
			
			if(apostas[i] < 0 || apostas[i] == 0 || apostas[i] > 60) {
				System.err.println("os numeros devem ser positivos e entre 1 e 60 ");
				i--;
				z--;
			}
			
			for(int j = 0; j < i; j++) {
				if(apostas[i] == apostas[j]) {
					System.err.println("Os numeros devem ser diferentes");
					i--;
					z--;
				} 			
			}

		}
		
		System.out.println();
		
		System.out.println("---------- numeros escolhidos ----------");
		for(int i = 0; i < apostas.length; i++) {
			System.out.print(apostas[i] +" ");
		}
		System.out.println();
		
		
		
		teclado.close();
	}

	
}

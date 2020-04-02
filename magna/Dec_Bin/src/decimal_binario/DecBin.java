package decimal_binario;

import java.util.Scanner;

import decimal_binario.PilhaInt.RetornoInt;

public class DecBin {
	public static void main(String[] args) {

		PilhaInt pilha = new PilhaInt();

		pilha.init();

		Scanner le = new Scanner(System.in);
		System.out.print("digite decimal ");
		int decimal = le.nextInt();
		int resto;
		while (decimal > 0) {
			resto = decimal % 2;
			pilha.push(resto);
			decimal = decimal / 2;
		}

		System.out.println("Número em binário");

		RetornoInt res = new RetornoInt();
		while (!pilha.isEmpty()) {
			res = pilha.pop();
			System.out.print(res.elem);
		}
		System.out.println();

		le.close();
	}
}

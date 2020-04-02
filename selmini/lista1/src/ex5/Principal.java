package ex5;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Bicicleta bicicleta = new Bicicleta("Roxo", 4, 100);
		Bicicleta bicicleta2 = new Bicicleta("Amarelo", 9, 250);
		Bicicleta bicicleta3 = new Bicicleta("Azul", 7, 200); // entrada de dados bicicleta 3

		// chama metodo
		Bicicleta aux = maisCara(bicicleta, bicicleta2, bicicleta3);

		System.out.println("\n");
		// imprime os dados da bicicleta mais cara
		System.out.println(aux.retornarDados());

		teclado.close();
	}

	private static Bicicleta maisCara(Bicicleta bicicleta, Bicicleta bicicleta2, Bicicleta bicicleta3) {
		Bicicleta aux = null;
		if (bicicleta.valor > bicicleta2.valor && bicicleta.valor > bicicleta3.valor) {
			aux = bicicleta;
		} else if (bicicleta2.valor > bicicleta3.valor) {
			aux = bicicleta2;
		} else {
			aux = bicicleta3;
		}
		return aux;
	}

}

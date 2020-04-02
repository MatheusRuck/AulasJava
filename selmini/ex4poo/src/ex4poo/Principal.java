package ex4poo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		Cliente c1 = new Cliente();
		System.out.println("Informe seu nome -> ");
		c1.nome = teclado.nextLine();
		System.out.println("Informe seu CPF -> ");
		c1.cpf = teclado.nextLine();
		System.out.println("Informe o número do cartão -> ");
		c1.cartao.numero = teclado.nextInt();
		System.out.println("Informe o total da fatura do cartão -> ");
		c1.cartao.totalFatura = teclado.nextDouble();

		System.out.println(c1.retornarDados());

		Funcionario.vale = 1400;
		Funcionario.aumentarVale(10);

		teclado.close();
	}

}

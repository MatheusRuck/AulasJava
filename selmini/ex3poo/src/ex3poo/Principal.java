package ex3poo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Professor professor = new Professor();
		
		//entrada de dados
		System.out.println("Informe o nome do professor -> ");
		professor.nome = teclado.nextLine();
		System.out.println("Informe a titulacão (mestre ou doutor)  -> ");
		professor.titulacao = teclado.nextLine();
		System.out.println("Informe o total de aulas semanais -> ");
		professor.totalDeAulas = teclado.nextInt();
		System.out.println("Informe o valor da hora aula -> ");
		professor.valorHoraAula = teclado.nextDouble();
		System.out.println("Informe a porcentagem de aumento no aumento no valor da hora aula -> ");
		professor.aumento = teclado.nextDouble();
		
		//saída de dados
		System.out.println();
		System.out.println(professor.retornarDados());
		
		//aplicar um aumento no valor da aula
		professor.ajustarValorHoraAula(professor.aumento);
		
		//saída de dados
		System.out.println();
		System.out.println(professor.retornarDados());
		
		
		
		teclado.close();
	}

}

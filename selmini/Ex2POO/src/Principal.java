import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		Paciente paciente = new Paciente();

		// entrada de dados
		System.out.println("Nome do paciente -> ");
		paciente.nome = teclado.nextLine();
		System.out.println("Idade do paciente -> ");
		paciente.idade = teclado.nextInt();

		paciente.imprimir();

		teclado.close();
	}

}

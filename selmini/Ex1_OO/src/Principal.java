import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Aluno a = new Aluno();
		System.out.print("informe seu RM -> ");
		a.rm = teclado.nextInt();
		teclado.nextLine();
		System.out.print("informe seu nome -> ");
		a.nome = teclado.nextLine();
		System.out.print("informe a primeira nota -> ");
		a.n1 = teclado.nextDouble();
		System.out.print("informe a segunda nota -> ");
		a.n2 = teclado.nextDouble();
		
		a.imprimir();
		teclado.close();
	}

}

package palindromo;

import java.util.Scanner;

import palindromo.PilhaInt.RetornoInt;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PilhaInt pilha = new PilhaInt();
		pilha.init();
		
		Scanner le = new Scanner(System.in);
		
		int lido[] = new int[pilha.N];
		int invertido[] = new int[pilha.N];
		
		int i=0;
		System.out.println("Digite dígito inteiro (0..9) ou -1 para parar");
		int n = le.nextInt();
		while (n>=0) {
			lido[i]=n;
			pilha.push(lido[i]);
			i++;
			System.out.println("Digite dígito inteiro (0..9) ou -1 para parar");
			n = le.nextInt();
		}
		
		//************************
		//continua na próxima aula
		//************************
		le.close();
	}

}

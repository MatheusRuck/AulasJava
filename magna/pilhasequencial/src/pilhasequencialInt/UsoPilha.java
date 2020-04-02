package pilhasequencialInt;

import pilhasequencialInt.PilhaInt.RetornoInt;

public class UsoPilha {

	public static void main(String[] args) {
		PilhaInt pilha = new PilhaInt();
		RetornoInt res = new RetornoInt();
		
		pilha.init();
		
		pilha.push(10);
		
		res = pilha.pop();
		if (res.sucesso)
			System.out.println("retirado: " + res.elem);
		

	}

}

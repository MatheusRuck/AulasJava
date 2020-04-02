package ex4poo;

public class TesteConta {

	public static void main(String[] args) {
		
		Conta c1 = new Conta();
		Conta c2 = new Conta();
		
		c1.saldo = 1000;
		c2.saldo = 1500;
		
		c1.transferir(c2, 500);
		System.out.println(c1.saldo);
		System.out.println(c2.saldo);
		
		c2.transferir(c1, 700);
		System.out.println(c1.saldo);
		System.out.println(c2.saldo);

	}

}

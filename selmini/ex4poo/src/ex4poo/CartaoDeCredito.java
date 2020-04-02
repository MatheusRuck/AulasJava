package ex4poo;

public class CartaoDeCredito {
	int numero;
	double totalFatura;

	public double consultarFatura() {
		return totalFatura;
	}

	public String retornarDados() {
		return "Numero: " + numero + "\n Total: "+ totalFatura;
	}

}

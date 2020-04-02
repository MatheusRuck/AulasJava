package ex5;

public class Bicicleta {
	String cor;
	int numdemarchas;
	double valor;

	// metodo construtor
	public Bicicleta(String cor, int numdemarchas, double valor) {
		this.cor = cor;
		this.numdemarchas = numdemarchas;
		this.valor = valor;
	}

	public String retornarDados() {
		return cor + "\n" + numdemarchas + "\n" + valor;

	}

}

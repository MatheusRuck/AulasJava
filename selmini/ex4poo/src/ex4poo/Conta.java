package ex4poo;

public class Conta {
	int numero;
	double saldo;
	double limite;

	public void sacar(double valor) {
		saldo -= valor;
	}

	public void depositar(double valor) {
		saldo += valor;
	}

	// metodo para retornar o saldo do cliente
	public double consultarSaldo() {
		return saldo;
	}

	// método para retornar os dados da conta
	public String retornarDados() {
		String aux = "";
		aux += "Número: " + numero + "\n";
		aux += "Saldo: " + saldo + "\n";
		aux += "Limite: " + limite + "\n";
		return aux;
	}

	// método para gerar um extrato de 7 dias
	public String gerarExtrato() {
		return "extrato de 7 dias";
	}

	// método para gerar um extrato de acordo com a qtd de dias
	public String gerarExtrato(int dias) {
		return "extrato de " + dias + " dias";
	}

	// método para transferir dinheiro de uma conta para outra
	public void transferir(Conta destino, double valor) {
		sacar(valor);
		destino.depositar(valor);
	}

}

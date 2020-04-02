package ex4poo;

public class Cliente {
	String nome;
	String cpf;
	CartaoDeCredito cartao = new CartaoDeCredito();
	Conta conta = new Conta();
	
	//metodo para retornar dados
	public String retornarDados() {
		String aux = "";
		aux += "Nome: " + nome + "\n";
		aux += "CPF: " + cpf +  "\n";
		aux += cartao.retornarDados();
		aux += conta.retornarDados();
		return aux;
	}

}

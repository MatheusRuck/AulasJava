package ex4poo;

public class Funcionario {
	String nome;
	String cpf;
	double salario;
	static double vale = 1230;

	public String retornarDados() {
		return "Funcionario: " + nome + "\n" + "CPF: " + cpf + "\n" + "Sal�rio: " + salario + "\n";
	}

	public void aumentarSalario(double porcentagem) {
		if (porcentagem < 0 || porcentagem > 100) {
			throw new Error("Porcentagem informada inv�lida");
		} else {
			salario += salario * (porcentagem / 100);
		}
	}

	public static void aumentarVale(double porcentagem) {
		if (porcentagem < 0 || porcentagem > 100) {
			throw new Error("Porcentagem informada inv�lida");
		} else {
			vale *= (1+porcentagem / 100);
		}
	}

}

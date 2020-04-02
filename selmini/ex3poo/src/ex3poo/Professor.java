package ex3poo;

public class Professor {

	// atributos
	String nome;
	String titulacao;
	int totalDeAulas;
	double valorHoraAula;
	double aumento;

	// m�todo para calcular sal�rio
	public double calcularSalario() {

		double sb, ha, dsr, salario;

		// calcular s�lario base
		sb = totalDeAulas * 4.5 * valorHoraAula;

		if (titulacao.equalsIgnoreCase("mestre")) {
			sb *= 1.03;
		} else if (titulacao.equalsIgnoreCase("doutor")) {
			sb *= 1.085;
		}

		// calcular hora adicional
		ha = sb * 0.05;

		// calcular descanso semanal remunerado
		dsr = (sb + ha) / 6;

		// salario final
		salario = sb + ha + dsr;

		return salario;
	}

	// metodo para ajustar valor da aula
	public void ajustarValorHoraAula(double porcentagem) {
		valorHoraAula *= (1 + porcentagem / 100);
	}

	// metodo para retornar dados para impress�o
	public String retornarDados() {
		String aux = "";
		aux += "Nome: " + nome + "\n";
		aux += "Titulac�o: " + titulacao + "\n";
		aux += "S�lario: R$ " + calcularSalario() + "\n";
		return aux;
	}
}

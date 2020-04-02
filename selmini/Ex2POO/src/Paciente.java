
public class Paciente {
	// atributo ou propriedade ou vari�vel de inst�ncia
	String nome;
	int idade;

	// m�todo para calcular a frequ�ncia m�xima
	public int frequenciaMaxima() {
		return 220 - idade;
	}

	// m�todo para calcular o alvo minimo
	public double alvoMinimo() {
		return frequenciaMaxima() * 0.5;
	}

	// m�todo para calcular o alvo m�ximo
	public double alvoMaximo() {
		return frequenciaMaxima() * 0.85;
	}
	
	//m�todo para imprimir 
	public void imprimir() {
		System.out.println();
		System.out.println("RESULTADOS");
		System.out.println("nome: "+nome);
		System.out.println("idade: "+idade);
		System.out.println("frequ�ncia m�xima: "+frequenciaMaxima());
		System.out.println("alvo m�ximo: "+alvoMaximo());
		System.out.println("alvo m�nimo: "+alvoMinimo());
		
	}
}

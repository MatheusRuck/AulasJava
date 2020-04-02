
public class Paciente {
	// atributo ou propriedade ou variável de instância
	String nome;
	int idade;

	// método para calcular a frequência máxima
	public int frequenciaMaxima() {
		return 220 - idade;
	}

	// método para calcular o alvo minimo
	public double alvoMinimo() {
		return frequenciaMaxima() * 0.5;
	}

	// método para calcular o alvo máximo
	public double alvoMaximo() {
		return frequenciaMaxima() * 0.85;
	}
	
	//método para imprimir 
	public void imprimir() {
		System.out.println();
		System.out.println("RESULTADOS");
		System.out.println("nome: "+nome);
		System.out.println("idade: "+idade);
		System.out.println("frequência máxima: "+frequenciaMaxima());
		System.out.println("alvo máximo: "+alvoMaximo());
		System.out.println("alvo mínimo: "+alvoMinimo());
		
	}
}

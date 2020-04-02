package br.fiapfit.atleta;

public class Atleta {
	private String nome;
	private double peso;
	private double altura;
	private double quadril;

	public Atleta(String nome, double peso, double altura, double quadril) {
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
		this.quadril = quadril;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getQuadril() {
		return quadril;
	}

	public void setQuadril(double quadril) {
		this.quadril = quadril;
	}

	public double calcularIMC() {
		return peso / (altura * altura);
	}

	public double calcularBAI() {
		return quadril /( altura * Math.sqrt(altura)) - 18;
	}
}

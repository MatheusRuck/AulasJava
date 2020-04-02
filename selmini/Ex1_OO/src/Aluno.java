
public class Aluno {

	// atributos ou propriedades ou variavel de instância
	int rm;
	String nome;
	double n1;
	double n2;

	// metodo para calcular e retornar a media
	public double calcularMedia() {
		return  (n1+n2)/2;
	}
	
	//metodo para retornar a situaçao
	public String verificarSituacao() {

		return calcularMedia() >= 6 ? "APROVADO" : "REPROVADO";
	}
	
	//metodo para imrpimir os dados
	public void imprimir() {
		System.out.println("RM -> "+rm);
		System.out.println("Nome -> "+nome);
		System.out.println("nota 1 -> "+n1);
		System.out.println("nota 2 -> "+n2);
		System.out.println("Media -> "+calcularMedia());
		System.out.println(verificarSituacao());
	}

}

package br.fiap.main;
import br.fiap.aluno.Aluno;

public class Principal {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno(82360, "matheus", "mathruck", "123");
		System.out.println(aluno.getNome());
		
		aluno.setNome("haha");
		System.out.println(aluno.getNome());

	}

}

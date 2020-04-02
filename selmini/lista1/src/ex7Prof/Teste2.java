package ex7Prof;

import javax.swing.JOptionPane;

public class Teste2 {

	public static void main(String[] args) {
		
		String titulo, genero, nome, cidade;
		
		titulo = JOptionPane.showInputDialog("Informe o titulo");
		genero = JOptionPane.showInputDialog("Informe o genero"); 
		nome = JOptionPane.showInputDialog("Informe o nome do autor"); 
		cidade = JOptionPane.showInputDialog("Informe a cidade do autor"); 

		Livro livro = new Livro(titulo, genero, nome, cidade);
		
		JOptionPane.showMessageDialog(null, livro.retornarDados());
	}

}

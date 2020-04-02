package fila_inteiros;

public class MainTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FilaInt fila = new FilaInt();
		
		//esvaziar a fila
		fila.init();
		
		fila.enqueue(6);
		fila.enqueue(7);
		fila.enqueue(5);
		if(fila.isEmpty() == false)
			System.out.println("valor retirado -> "+ fila.dequeue());
		
		if(fila.isEmpty() == false)
			System.out.println("valor retirado -> "+ fila.dequeue());
		
		if(fila.isEmpty() == false)
			System.out.println("valor retirado -> "+ fila.dequeue());

	}

}

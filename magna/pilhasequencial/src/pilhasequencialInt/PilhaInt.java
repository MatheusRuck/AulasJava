package pilhasequencialInt;

public class PilhaInt {
	public final int  N = 6;

	int dados[] = new int[N];
	int topo;

	public void init() {
		topo = 0;
	}

	public boolean isFull() {
		if (topo == N)
			return true;
		else
			return false;
	}
	
	public void push(int elem) {
		if (isFull() == false) {
			dados[topo]=elem;
			topo++;
			}
		else
			System.out.println("Stack overflow");
	}

	public boolean isEmpty() {
		if (topo == 0)
			return true;
		else
			return false;
	}
	
	public class RetornoInt{
		int elem;
		boolean sucesso;
	}
	
	public RetornoInt pop() {
		RetornoInt saida = new RetornoInt();
		if(isEmpty()) {
			saida.sucesso=false;
			System.out.println("Stack is empty");
			}
		else {
			topo--;
			saida.elem = dados[topo];
			saida.sucesso= true;
			}
		return saida;
	}

}

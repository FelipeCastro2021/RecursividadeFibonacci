package View;

public class Fibonacci {
	
	public Fibonacci() {
		super();
	}

	public int FibonacciCount(int posicao) {		
		if (posicao == 0) {
			return 0;
		} 
		
		if (posicao == 1 || posicao == 2) {
			return 1;
		} else {
			return FibonacciCount(posicao - 1) + FibonacciCount(posicao - 2);
		}
	}
}

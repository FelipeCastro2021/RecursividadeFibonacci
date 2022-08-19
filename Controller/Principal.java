package Controller;

import View.Fibonacci;

public class Principal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci fibonacci = new Fibonacci();
		
		int posicao = 13;
		
		int resultado = fibonacci.FibonacciCount(posicao);
		
		System.out.println(resultado);
	}
}

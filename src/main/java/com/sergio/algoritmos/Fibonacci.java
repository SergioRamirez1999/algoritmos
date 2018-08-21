package com.sergio.algoritmos;

public class Fibonacci {
	private int largo;
	private final int[] sucesion;
	
	public Fibonacci( int largo) {
		this.largo = largo;
		this.sucesion = new int[largo];
	}
	
	public int getLargo() {
		return largo;
	}
	
	private int fibonacci(int n) {
		if (n<2)
			return n;
		return fibonacci(n-1)+fibonacci(n-2);
	}
	
	public int[] sucesion() {
		System.out.println("Largo : " + largo);
		for(int i = 0; i < getLargo(); i++) {
			this.sucesion[i] = fibonacci(i);
		}
		return sucesion;
	}
	
	public int getIndex(int index) {
	   if(index <= this.largo)
	      return sucesion[index-1];
	   
	   return -1;
	}
	
	public static void main(String [] args) {
		Fibonacci obj = new Fibonacci(11);
		for(int temp: obj.sucesion()) {
		   System.out.print(temp + " ");
		}
		System.out.println("Obtengo por index: " + obj.getIndex(11));
	}
	
}

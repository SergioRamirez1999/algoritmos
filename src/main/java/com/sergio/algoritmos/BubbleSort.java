package com.sergio.algoritmos;


public class BubbleSort {

	public static void main(String[] args) {
		int [] vector = {33,11,6,500,1,22,44,2,10,4,5};
		System.out.println(System.currentTimeMillis());
		vector = ordenamiento(vector);
		System.out.println(System.currentTimeMillis());
		for(int temp: ordenamiento(vector))
		   System.out.println(temp);
		//infoVector(vector);
	}
	
	private static int[] ordenamiento(int [] vector) {
		int longitud = vector.length;
		int limite = 0;
		int temp = 0;
		for(int i = 0; i < longitud-1; i++) {
			for(int h = 1; h < longitud-limite; h++) {
				if(vector[h-1] > vector[h]) {
					temp = vector[h-1];
					vector[h-1] = vector[h];
					vector[h] = temp;
				}
			}
			limite++;
		}
		return vector;
	}
	
	private static void infoVector(int [] vector) {
		int longitud = vector.length;
		int suma = 0;
		int multiplicacion = 1;
		int max = 0;
		int min = vector[0];
		double promedio = 0;
		for(int i = 0; i < longitud; i++) {
			suma += vector[i];
			multiplicacion *= vector[i];
		}
		for(int i = 1; i < longitud; i++) {
			if(vector[i] < min) {
				min = vector[i];
			} else {
				max = vector[i];
			}
		}
		promedio = suma / vector.length;
		System.out.println("Valor minimo: " + min);
		System.out.println("Valor maximo: " + max);
		System.out.println("Suma: " + suma);
		System.out.println("Multiplicacion : " + multiplicacion);
		System.out.println("Promedio: " + promedio);
		
	}
	
}

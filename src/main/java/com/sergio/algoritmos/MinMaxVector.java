package com.sergio.algoritmos;


public class MinMaxVector {

	public static void main(String[] args) {
		
		int[] myList = {5,4,8,6,3,2,9};
		
		imprimeInfoVector(myList);
 
	}
	
	private static void imprimeInfoVector(int [] vector) {
		int max, min, producto;
		double promedio = 0.0;
		producto = 1;
		min=max=vector[0];
 
		for(int i = 0; i < vector.length; i++)
		{
			//min y max
			if(min>vector[i])
			{
				min=vector[i];
			}
			if(max<vector[i])
			{
				max=vector[i];
			}
			//suma y promedio...
			promedio = promedio + vector[i];
			
			//producto
			producto = producto * vector[i];
		}
		
		
		System.out.print("El máximo es " + max + ", el minimo es " + min + ", la suma total es " +promedio+ ", el producto es  " + producto + ", el promedio es ");
		
		promedio = promedio / vector.length;
		
		System.out.print(promedio);
	}

}

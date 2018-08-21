package com.sergio.algoritmos;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String palabra;
		String palabrainvertida = "";
		System.out.println("Ingresa una palabra y se mostrara a la inversa:\n");
		palabra = s.nextLine();

		for (int i = palabra.length() -1 ; i >= 0; i--) {
			palabrainvertida += palabra.charAt(i);
		}
		
		char[] vector = palabrainvertida.toCharArray();
		
		for(char temp: vector)
		   System.out.println(temp);

		System.out.println("La palabra invertida es:\n" + palabrainvertida);
		s.close();
		
		
	}

}

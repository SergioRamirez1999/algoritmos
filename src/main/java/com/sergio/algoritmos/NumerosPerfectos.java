package com.sergio.algoritmos;

import java.util.ArrayList;
import java.util.List;

public class NumerosPerfectos {

	public static void main(String[] args) {
	   perfectsNumbers(9000).forEach(x -> System.out.println("..."+x));
	   System.out.println(isPerfect(8128));
		
	}
	
	private static List<Integer> perfectsNumbers(int cant) {
	   List<Integer> lstNumbers = new ArrayList<>();
	   
	   if(cant > 0) {
	      for(int i = 1; i < cant; i++) {
	         int suma = 0;
	         for(int h = 1; h < i; h++) {
	            if(i % h == 0)
	               suma+=h;
	         }
	         if(suma == i) 
	            lstNumbers.add(i);
	      }
	   }
	   
	   return lstNumbers;
	}
	
	private static boolean isPerfect(int number) {
	   boolean flag = false;
	   if(number > 0) {
	      int suma = 0;
	      for(int i = 1; i < number; i++) {
	         if(number % i == 0)
	            suma+=i;
	      }
	      if(suma==number)
	         flag = true;
	   }
	   return flag;
	}
		
}

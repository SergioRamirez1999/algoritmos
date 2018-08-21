package com.sergio.algoritmos;

public class Supermain {

	public static void main(String[] args) {
	   int[][] vector = new int[4][3];
	   int[][] vector2 = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
	   
	   vector[0][0] = 1;
	   vector[0][1] = 2;
	   vector[0][2] = 3;
	   vector[1][0] = 4;
	   vector[1][1] = 5;
	   vector[1][2] = 6;
	   vector[2][0] = 7;
      vector[2][1] = 8;
      vector[2][2] = 9;
      vector[3][0] = 10;
      vector[3][1] = 11;
      vector[3][2] = 12;
	   
      System.out.println("Vector: ");
	   for(int[] temp: vector) {
	      for(int elem: temp) {
	         System.out.print(elem + " ");
	      }
	      System.out.println();
	   }
	   System.out.println();
	   System.out.println("Vector: ");
      for(int[] temp: vector2) {
         for(int elem: temp) {
            System.out.println(elem);
         }
      }
	       
	}

}
 
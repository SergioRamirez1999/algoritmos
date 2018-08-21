package com.sergio.algoritmos;

public class CopyFibonacci {
   private int[] serie;
   private int longitud;
   
   public CopyFibonacci(int longitud) {
      this.serie = new int[longitud];
      this.longitud = longitud;
   }
   
   public int[] ejecutarSerie() {
      for(int i = 0; i < longitud; i++) {
         serie[i] = serieFibonacci(i);
      }
      return serie;
   }
   
   private int serieFibonacci(int n) {
      if(n<2) {
         return n;
      }
      return serieFibonacci(n-1) + serieFibonacci(n-2);
   }
   
   public int getByIndex(int i) {
      return serie[i-1];
   }


   public static void main(String[] args) {
      CopyFibonacci fibonacci = new CopyFibonacci(10);
      for(int temp: fibonacci.ejecutarSerie())
         System.out.print(temp + " ");
      
   }

}

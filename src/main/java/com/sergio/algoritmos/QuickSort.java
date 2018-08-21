package com.sergio.algoritmos;

public class QuickSort {

   public static void main(String[] args) {
      int[] vector = {5,3,0,4,9 };
      System.out.println(System.currentTimeMillis());
      vector = ordenQuickSort(vector);
      System.out.println(System.currentTimeMillis());
      for(int temp: vector) {
         System.out.print(temp + " ");
      }
      
   }

   static int[] ordenQuickSort(int[] array) {
      return array = quickSort1(array);
   }

   static int[] quickSort1(int[] numeros) {
      return quickSort2(numeros, 0, numeros.length - 1);
   }

   static int[] quickSort2(int[] numeros, int izq, int der) {

      if (izq >= der)
         return numeros;

      int i = izq, d = der;

      if (izq != der) {

         int pivote;
         int aux;
         pivote = izq;

         while (izq != der) {
            while (numeros[der] >= numeros[pivote] && izq < der)
               der--;
            while (numeros[izq] < numeros[pivote] && izq < der)
               izq++;
            if (der != izq) {
               aux = numeros[der];
               numeros[der] = numeros[izq];
               numeros[izq] = aux;
            }
         }

         if (izq == der) {
            quickSort2(numeros, i, izq - 1);
            quickSort2(numeros, izq + 1, d);
         }

      } else
         return numeros;

      return numeros;
   }
}

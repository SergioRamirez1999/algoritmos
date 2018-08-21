package com.sergio.algoritmos;

import java.util.Random;
import java.util.Scanner;

public class TresUltimos {

   public static void main(String[] args) {
      
      /*Scanner scanner = new Scanner(System.in);
      System.out.println("Introduzca el numero: ");
      int num = scanner.nextInt();*/
      
      int i = 0;
  
      while(i < 100) {
         int num = (int)(Math.random()*100);
         double resultado = Math.pow((3+Math.sqrt(num)), num);
         String cadena = String.valueOf(resultado);
         if(cadena.contains(".")) {
            String[] split = cadena.split("\\.");
            System.out.println(split[0].substring(split[0].length()-3, split[0].length()));
         }else {
            System.out.println(cadena.substring(cadena.length()-3, cadena.length()));
         }
         i++;
      }
      
      //scanner.close();
   }

}

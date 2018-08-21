package com.sergio.algoritmos;

import java.util.Scanner;

public class Pangrama {
   
   public static boolean isPangrama(char[] sistema, String frase) {
      boolean flag = true;
      frase = frase.toLowerCase();
      int longitud = sistema.length;
      for(int i = 0; i < longitud; i++) {
         if(!frase.contains(String.valueOf(sistema[i]))) {
            flag = false;
            break;
         }
      }
      return flag;
   }
   
   public static boolean[] isPangramaVector(char[] sistema, String[] frase) {
      boolean[] pangramas = new boolean[frase.length];

      for(int i = 0; i < pangramas.length; i++)
         pangramas[i] = true;
      
      for(int i = 0; i < frase.length; i++) {
         for(int h = 0; h < sistema.length; h++) {
            frase[i] = frase[i].toLowerCase();
            if(!frase[i].contains(String.valueOf(sistema[h]))) {
               pangramas[i] = false;
               break;
            }
         }
      }
      
      return pangramas;
   }
   
   
   public static void main(String[] args) {
      char[] espaniol = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o'
                              ,'p','q','r','s','t','u','v','w','x','y','z'};
      
      Scanner scanner = new Scanner(System.in);
      
      System.out.println("Cantidad de frases que ingresará: ");
      String[] frases = new String[scanner.nextInt()];
      
      frases[0] = scanner.nextLine();
      for(int i = 0; i < frases.length; i++) {
         System.out.println("Ingrese la frase " + i + " :");
         frases[i] = scanner.nextLine();
      }
      
      boolean[] pangramas = isPangramaVector(espaniol, frases);
      
      for(int i = 0; i < pangramas.length; i++) {
         if(pangramas[i]) {
            System.out.println("La frase \"" + frases[i] + "\" es un pangrama");
         }else {
            System.out.println("La frase \"" + frases[i] + "\" no es un pangrama");
         }
      }
      
      scanner.close();
   }

}
